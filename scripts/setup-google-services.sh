#!/usr/bin/env bash
set -e

if [ ! -f "app/google-services.json" ]; then
  mkdir -p app
  cat << 'JSON' > app/google-services.json
{
  "project_info": {
    "project_number": "000000000000",
    "project_id": "codeonthego-debug",
    "storage_bucket": "codeonthego-debug.appspot.com"
  },
  "client": [
    {
      "client_info": {
        "mobilesdk_app_id": "1:000000000000:android:0000000000000000000000",
        "android_client_info": {
          "package_name": "com.itsaky.androidide"
        }
      },
      "oauth_client": [],
      "api_key": [
        {
          "current_key": "dummy_api_key_for_ci_build"
        }
      ],
      "services": {
        "appinvite_service": {
          "other_platform_oauth_client": []
        }
      }
    }
  ],
  "configuration_version": "1"
}
JSON
  echo "Created app/google-services.json"
fi
