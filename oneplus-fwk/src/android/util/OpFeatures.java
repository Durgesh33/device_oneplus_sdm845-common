package android.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.BitSet;

public final class OpFeatures {

    private static String LOG_TAG = OpFeatures.class.getSimpleName();

    public static final int OP_FEATURE_SKU_CHINA = 0;
    public static final int OP_FEATURE_SKU_GLOBAL = 1;
    public static final int OP_FEATURE_MDM = 2;
    public static final int OP_FEATURE_BUGREPORT = 3;
    public static final int OP_FEATURE_AUTO_STARTUP = 4;
    public static final int OP_FEATURE_OP_KEYGUARD = 5;
    public static final int OP_FEATURE_MMS_NOTI_SOUND = 6;
    public static final int OP_FEATURE_MULTI_SIM_RINGTONES = 7;
    public static final int OP_FEATURE_FASTPAIR = 8;
    public static final int OP_FEATURE_TURNOFF_LOADING = 9;
    public static final int OP_FEATURE_MM_DISPLAY_COLOR_SCREEN_MODE = 10;
    public static final int OP_FEATURE_SWAP_KEYS = 11;
    public static final int OP_FEATURE_BACK_COVER_THEME = 12;
    public static final int OP_FEATURE_TRI_STATE_KEY = 13;
    public static final int OP_FEATURE_KEY_LOCK = 14;
    public static final int OP_FEATURE_CTA_PERMISSION_CONTROL = 15;
    public static final int OP_FEATURE_GESTURE_SCREENSHOT = 16;
    public static final int OP_FEATURE_BG_DETECTION = 17;
    public static final int OP_FEATURE_RINGTONE_ALIAS = 18;
    public static final int OP_FEATURE_RINGTONE_BKP = 19;
    public static final int OP_FEATURE_BLACK_GESTURE = 20;
    public static final int OP_FEATURE_RESERVE_APP = 21;
    public static final int OP_FEATURE_OPEN_ID = 22;
    public static final int OP_FEATURE_HEYTAP_BUSINESS = 23;
    public static final int OP_FEATURE_EXT_AUDIO_DECODER = 24;
    public static final int OP_FEATURE_POST_INSTALL_AMAZON_APPS = 25;
    public static final int OP_FEATURE_CHANGE_PACKAGE_NAME = 26;
    public static final int OP_FEATURE_APP_BOOT_MANAGER = 27;
    public static final int OP_FEATURE_MEMORY_TRACKER = 28;
    public static final int OP_FEATURE_APPRECORD = 29;
    public static final int OP_FEATURE_APP_LOCKER = 30;
    public static final int OP_FEATURE_LONG_SCREENSHOT = 31;
    public static final int OP_FEATURE_SCENE_MODES = 32;
    public static final int OP_FEATURE_QUICK_PAY = 33;
    public static final int OP_FEATURE_ONEPLUS_RECOVERY = 34;
    public static final int OP_FEATURE_PARALLEL_APP = 35;
    public static final int OP_FEATURE_ONEPLUS_BOOTANIMATION = 36;
    public static final int OP_FEATURE_UXREALM = 37;
    public static final int OP_FEATURE_PHOTOS_PROTECTOR = 38;
    public static final int OP_FEATURE_HIDE_NAVBAR = 39;
    public static final int OP_FEATURE_OPCD = 40;
    public static final int OP_FEATURE_APP_USAGE_CLASSIFICATION = 41;
    public static final int OP_FEATURE_SCREEN_COMPAT = 42;
    public static final int OP_FEATURE_QUICK_REPLY = 43;
    public static final int OP_FEATURE_OTG_AUTO_SHUTDOWN = 44;
    public static final int OP_FEATURE_FACE_UNLOCK = 45;
    public static final int OP_FEATURE_BOOT_ENTER_BOUNCER = 46;
    public static final int OP_FEATURE_VIBRATION_INTENSITY = 47;
    public static final int OP_FEATURE_CUSTOM_KEYS = 48;
    public static final int OP_FEATURE_SOC_TRI_STATE_KEY = 49;
    public static final int OP_FEATURE_CUSTOM_STATUS_BAR = 50;
    public static final int OP_FEATURE_NEW_PLAN_POWEWR_OFF_ALARM = 51;
    public static final int OP_FEATURE_PCB_WATER_MARK = 52;
    public static final int OP_FEATURE_SYSTEM_UPDATE_BY_AB = 53;
    public static final int OP_FEATURE_ENABLE_HBM = 54;
    public static final int OP_FEATURE_ENABLE_AD = 55;
    public static final int OP_FEATURE_ENABLE_EU = 56;
    public static final int OP_FEATURE_TYPE_RGB = 57;
    public static final int OP_FEATURE_ALWAYS_ON_DISPLAY = 58;
    public static final int OP_FEATURE_SHOW_MULTI_VOLTE = 59;
    public static final int OP_FEATURE_GESTURE_BUTTON = 60;
    public static final int OP_FEATURE_VIDEO_ENHANCER = 61;
    public static final int OP_FEATURE_HEARING_AID = 62;
    public static final int OP_FEATURE_DEVICEID_LEN_T = 63;
    public static final int OP_FEATURE_BLUETOOTH_HEADSET = 64;
    public static final int OP_FEATURE_CAMERA_NOTCH = 65;
    public static final int OP_FEATURE_HIDE_CAMERA_NOTCH = 66;
    public static final int OP_FEATURE_CUSTOM_NAVBAR = 67;
    public static final int OP_FEATURE_SHOW_HD_FOR_CT = 68;
    public static final int OP_FEATURE_OPDIAGNOSE = 69;
    public static final int OP_FEATURE_SETTINGS_QUICKPAY_ANIM_FOR_ENCHILADA = 70;
    public static final int OP_FEATURE_SCREEN_CUTTING = 71;
    public static final int OP_FEATURE_ENABLE_FALSINGTOUCH = 72;
    public static final int OP_FEATURE_GAMEMODE_NETBOOST = 73;
    public static final int OP_FEATURE_GAMEMODE_POWERSAVER = 74;
    public static final int OP_FEATURE_OP2_RECOVERY = 75;
    public static final int OP_FEATURE_ENABLE_FINGERPRINT_VENDOR_MOUDLE = 76;
    public static final int OP_FEATURE_SMALL_BOARD_CHECK_FAJITA = 77;
    public static final int OP_FEATURE_SUPPORT_CUSTOM_FINGERPRINT = 78;
    public static final int OP_FEATURE_ENABLE_FINGERPRINT_POCKET = 79;
    public static final int OP_FEATURE_SHUTDOWN_ANIMATION = 80;
    public static final int OP_FEATURE_NETWORK_MODE_DISABLE_2G = 81;
    public static final int OP_FEATURE_HEADSET_IMPEDANCE_DETECTION = 82;
    public static final int OP_FEATURE_REMOVE_ROAMING_ICON = 83;
    public static final int OP_FEATURE_DATA_ROAMING_ENABLE_MESSAGE = 84;
    public static final int OP_FEATURE_OIMC = 85;
    public static final int OP_FEATURE_APP_STATE_BROADCAST = 86;
    public static final int OP_FEATURE_OPSM = 87;
    public static final int OP_FEATURE_SHOW_4G_LTE = 88;
    public static final int OP_FEATURE_RTT = 89;
    public static final int OP_FEATURE_ANT_MODE_1X1 = 90;
    public static final int OP_FEATURE_UST_MODE = 91;
    public static final int OP_FEATURE_CUSTOM_BLINK_LIGHT = 92;
    public static final int OP_FEATURE_AGGRESSIVE_DOZE = 93;
    public static final int OP_FEATURE_SMART_POWER_CONTROL = 94;
    public static final int OP_FEATURE_ALARM_ALIGNMENT = 95;
    public static final int OP_FEATURE_BACKGROUND_PROCESS_FROZEN = 96;
    public static final int OP_FEATURE_DEEP_TASK_CLEANER = 97;
    public static final int OP_FEATURE_SETUSERADJ_CONFIG = 98;
    public static final int OP_FEATURE_BGC = 99;
    public static final int OP_FEATURE_OPCS_RECORD_SCREENON_TIME = 100;
    public static final int OP_FEATURE_OHPD = 101;
    public static final int OP_FEATURE_OHPD_CLEAN_LOW = 102;
    public static final int OP_FEATURE_SOC_MOVIES_STATE_KEY = 103;
    public static final int OP_FEATURE_FROZEN = 104;
    public static final int OP_FEATURE_QUICK_LAUNCH = 105;
    public static final int OP_FEATURE_SWEET_MOMENTS = 106;
    public static final int OP_FEATURE_COLOR_MODE_FB0 = 107;
    public static final int OP_FEATURE_PARAM_ENCRYPTION = 108;
    public static final int OP_FEATURE_MAX_BACKLIGHT = 109;
    public static final int OP_FEATURE_CUSTOME_ANIMATION = 110;
    public static final int OP_FEATURE_MOTOR_CONTROL = 111;
    public static final int OP_FEATURE_ALERT_SLIDER_RVS = 112;
    public static final int OP_FEATURE_SHOW_NOTIFICATION_BAR_BY_FINGERPRINT_SENSOR = 113;
    public static final int OP_FEATURE_PROCESS_RESIDENT = 114;
    public static final int OP_FEATURE_PARAM_BUILD_SERVICE = 115;
    public static final int OP_FEATURE_OPERATOR_GPS_E911 = 116;
    public static final int OP_FEATURE_ONEPLUS_CB = 117;
    public static final int OP_FEATURE_SCREEN_REFRESH_RATE = 118;
    public static final int OP_FEATURE_X_LINEAR_VIBRATION_MOTOR = 119;
    public static final int OP_FEATURE_HBM_AUTO_ADJUST = 120;
    public static final int OP_FEATURE_DIS_P_SENSOR_IN_AB = 121;
    public static final int OP_FEATURE_BOOST_BRIGHTNESS = 122;
    public static final int OP_FEATURE_EN_P_SENSOR_IN_AB = 123;
    public static final int OP_FEATURE_CN_GOOGLEPLAY_SERVICE = 124;
    public static final int OP_FEATURE_CAR_MODE = 125;
    public static final int OP_FEATURE_FAKE_PROXIMITY = 126;
    public static final int OP_FEATURE_SUPPORT_5G = 127;
    public static final int OP_FEATURE_PRELOAD_APP_TO_DATA = 128;
    public static final int OP_FEATURE_SMART_BOOST = 129;
    public static final int OP_FEATURE_NOTIFICATION_LIGHT = 130;
    public static final int OP_FEATURE_AD_MODE = 131;
    public static final int OP_FEATURE_INSTALL_FROM_MARKET = 132;
    public static final int OP_FEATURE_APP_PREDICTION = 133;
    public static final int OP_FEATURE_AUDIO_ONLINECONFIG = 134;
    public static final int OP_FEATURE_MISTOUCH_PREVENTION = 135;
    public static final int OP_FEATURE_READING_MODE_INTERPOLATER = 136;
    public static final int OP_FEATURE_UPDATE_RESERVE = 137;
    public static final int OP_FEATURE_SYSTEM_OVERLAY = 138;
    public static final int OP_FEATURE_DROP_DOWN_STATUS_BAR_WITH_FINGER = 139;
    public static final int OP_FEATURE_EARPHONE_MODE = 140;
    public static final int OP_FEATURE_ENABLE_POCKETMODE_SWITCH = 141;
    public static final int OP_FEATURE_RESRTICT_PKG_BASE_ON_NETWORK = 142;
    public static final int OP_FEATURE_PREBUILD_NETFLIX = 143;
    public static final int OP_FEATURE_APPS_DISPLAY_IN_FULLSCREEN = 144;
    public static final int OP_FEATURE_CTA_USE_PACKAGEINSTALLER_PERMISSION = 145;
    public static final int OP_FEATURE_WARP_CHARGE_5V6A = 146;
    public static final int OP_FEATURE_SPRINT = 147;
    public static final int OP_FEATURE_SPRINT_HIDDENMENU = 148;
    public static final int OP_FEATURE_SUPPORT_CUSTOMIZE_CLIENTID_MS = 149;
    public static final int OP_FEATURE_OVERHEAT_ENABLE = 150;
    public static final int OP_FEATURE_OVERHEAT_SKIN = 151;
    public static final int OP_FEATURE_HIGH_VSYNC = 152;
    public static final int OP_FEATURE_USS = 153;
    public static final int OP_FEATURE_USS_HIDDENMENU = 154;
    public static final int OP_FEATURE_POWER_CONSUMPTION_STATISTICS = 155;
    public static final int OP_FEATURE_POWER_CONTROLLER = 156;
    public static final int OP_FEATURE_COLOR_DISPLAY = 157;
    public static final int OP_FEATURE_OVERHEAT_DIAGNOSIS = 158;
    public static final int OP_FEATURE_OEMEX_SERVICE = 159;
    public static final int OP_FEATURE_STANDBY_DETECTION = 160;
    public static final int OP_FEATURE_ONEPLUS_SERVICE = 161;
    public static final int OP_FEATURE_FAST_CHARGE = 162;
    public static final int OP_FEATURE_MM_ALERTSLIDER = 163;
    public static final int OP_FEATURE_MM_LOG = 164;
    public static final int OP_FEATURE_MM_RESTORE_MODE = 165;
    public static final int OP_FEATURE_MM_HEADSET_PROFILE = 166;
    public static final int OP_FEATURE_MM_REDUCE_SAR = 167;
    public static final int OP_FEATURE_MM_TA = 168;
    public static final int OP_FEATURE_MM_WIDEVINE_DRM_L1 = 169;
    public static final int OP_FEATURE_MM_ULTRASOUND = 170;
    public static final int OP_FEATURE_MM_SMARTPA = 171;
    public static final int OP_FEATURE_MM_EU_ACDB_LOADER = 172;
    public static final int OP_FEATURE_MM_ENGINEERING_MODE = 173;
    public static final int OP_FEATURE_DEVICE_DEFAULT_WALLPAPER = 174;
    public static final int OP_FEATURE_WIFI_SERVICE = 175;
    public static final int OP_FEATURE_MM_AW = 176;
    public static final int OP_FEATURE_MM_CH_SWITCH = 177;
    public static final int OP_FEATURE_MM_AUDIO_DIAGNOSIS = 178;
    public static final int OP_FEATURE_PERF_MANAGER = 179;
    public static final int OP_FEATURE_NEW_MEMORY_OPTIMIZATION = 180;
    public static final int OP_FEATURE_OPUTIL = 181;
    public static final int OP_FEATURE_SKIP_UIDIDLE = 182;
    public static final int OP_FEATURE_SCREENSHOT_IMPROVEMENT = 183;
    public static final int OP_FEATURE_GPS_NOTIFICATION = 184;
    public static final int OP_FEATURE_ZEN_MODE = 185;
    public static final int OP_FEATURE_TCP_CONTROL = 186;
    public static final int OP_FEATURE_LOD_SWITCH = 187;
    public static final int OP_FEATURE_TCS3701_HBR_ENABLED = 188;
    public static final int OP_FEATURE_MM_HAC = 189;
    public static final int OP_FEATURE_MM_MODECLIENT = 190;
    public static final int OP_FEATURE_MM_RECODER_CH_SWITCH = 191;
    public static final int OP_FEATURE_MM_RECORDING_SCREEN = 192;
    public static final int OP_FEATURE_MM_AUDIO_CGROUP = 193;
    public static final int OP_FEATURE_MM_WECHAT_NS = 194;
    public static final int OP_FEATURE_MM_NS_AEC = 195;
    public static final int OP_FEATURE_DEXOPT = 196;
    public static final int OP_FEATURE_SKIP_DOFRAME = 197;
    public static final int OP_FEATURE_PROCESS_ADJ_CONTROL = 198;
    public static final int OP_FEATURE_SCREEN_ROTATION_IMPROVEMENT = 199;
    public static final int OP_FEATURE_JANKMANAGER = 200;
    public static final int OP_FEATURE_LANDSCAPE_APP_ANIMATION_IMPROVEMENT = 201;
    public static final int OP_FEATURE_EMBRYO = 202;
    public static final int OP_FEATURE_MM_AUDIO_CURVE = 203;
    public static final int OP_FEATURE_HWUI_SKIA_REDUCE_OVERDRAW = 204;
    public static final int OP_FEATURE_MM_MDM = 205;
    public static final int OP_FEATURE_MM_AUDIO_ELEVOC_ECNS = 206;
    public static final int OP_FEATURE_MM_LOW_KING_VOLUME = 207;
    public static final int OP_FEATURE_AI_GESTURE = 208;
    public static final int OP_FEATURE_MM_VIDEO_ENHANCEMENT = 209;
    public static final int OP_FEATURE_UNIFIED_DEVICE = 210;
    public static final int OP_FEATURE_REDSCREEN_ASSERTION = 211;
    public static final int OP_FEATURE_INFRARED_POWER_CONTROL = 212;
    public static final int OP_FEATURE_OPSLA = 213;
    public static final int OP_FEATURE_SYNTHETIC_PASSWORD_DISABLED = 214;
    public static final int OP_FEATURE_SYSTEM_PRODUCTION_RINGTONE = 215;
    public static final int OP_FEATURE_APP_PRELOAD = 216;
    public static final int OP_FEATURE_VERIFICATION_BUBBLE = 217;
    public static final int OP_FEATURE_Z_VIBRATION_MOTOR = 218;
    public static final int OP_FEATURE_TRIPLE_CAMERA = 219;
    public static final int OP_FEATURE_REPORT_WIFI_GENERATION_INFO = 220;
    public static final int OP_FEATURE_BAS_WHITELIST = 221;
    public static final int OP_FEATURE_ENABLE_UNDERSCREEN_SENSOR = 222;
    public static final int OP_FEATURE_CUSTOM_GAME_CENTER = 223;
    public static final int OP_FEATURE_CUSTOM_ONEPLUS_WALLET = 224;
    public static final int OP_FEATURE_ENABLE_GAMUT_MAPPING = 225;
    public static final int OP_FEATURE_ENABLE_GAME_VIBRATE = 226;
    public static final int OP_FEATURE_DIM_MODE_GESTURE = 227;
    public static final int OP_FEATURE_UPDATE_INDIA = 228;
    public static final int OP_FEATURE_USE_AUDIO_STATE = 229;
    public static final int OP_FEATURE_SCREEN_ON_USE_ULTRASOUND = 230;
    public static final int OP_FEATURE_SCREEN_ON_USE_INFRARED = 231;
    public static final int OP_FEATURE_SCREEN_ON_USE_TP = 232;
    public static final int OP_FEATURE_SUPPORT_COLOR_READ_MODE = 233;
    public static final int OP_FEATURE_SCREEN_AOD_USE_ULTRASOUND = 234;
    public static final int OP_FEATURE_SCREEN_AOD_USE_INFRARED = 235;
    public static final int OP_FEATURE_SCREEN_OFF_USE_ULTRASOUND = 236;
    public static final int OP_FEATURE_SCREEN_OFF_USE_INFRARED = 237;
    public static final int OP_FEATURE_INFRARED_PROXIMITY_SUPPORT = 238;
    public static final int OP_FEATURE_SAR_TEST_SUPPORT = 239;
    public static final int OP_FEATURE_COLOR_ADS = 240;
    public static final int OP_FEATURE_URL_INSTANT_APP = 241;
    public static final int OP_FEATURE_PWM_UNDER_SCREEN_LIGHT = 242;
    public static final int OP_FEATURE_MM_LIMIT_SVA_BARGIN = 243;
    public static final int OP_FEATURE_GESTURE_DEPRECATED = 244;
    public static final int OP_FEATURE_ONE_HAND_MODE = 245;
    public static final int OP_FEATURE_DAILY_PROTO_REPORTING = 246;
    public static final int OP_FEATURE_MCL_FONT = 247;
    public static final int OP_FEATURE_CUSTOM_BROWSER_APP_INFO = 248;
    public static final int OP_FEATURE_DECR_BL_CJ = 249;
    public static final int OP_FEATURE_OPRECOVERY_BOOT_REASON = 250;
    public static final int OP_FEATURE_KTV_LOOPBACK = 251;
    public static final int OP_FEATURE_DYNAMIC_RESOLUTION = 252;
    public static final int OP_FEATURE_SUPPORT_5G_LTE = 253;
    public static final int OP_FEATURE_HOLE_PUNCH_FRONT_CAM = 254;
    public static final int OP_FEATURE_USV_MODE = 255;
    public static final int OP_FEATURE_IRIS_CHIP_ENABLE = 256;
    public static final int OP_FEATURE_SOFT_IRIS_ENABLE = 257;
    public static final int OP_FEATURE_MM_ABANDON_DELAY = 258;
    public static final int OP_FEATURE_GPS_NFW_OTA_PATCH = 259;
    public static final int OP_FEATURE_PIXELWORKS_BRIGHTNESS_SMOOTH = 260;
    public static final int OP_FEATURE_FORCE_DARK = 261;
    public static final int OP_FEATURE_WIRELESS_CHARGE = 262;
    public static final int OP_FEATURE_MM_FAST_WHITELIST = 263;
    public static final int OP_FEATURE_AI_BOOST_PACKAGE = 264;
    public static final int OP_FEATURE_CARRIER_3_BROADCAST_CUST = 265;
    public static final int OP_FEATURE_BLUETOOTH_UART_LOG = 266;
    public static final int OP_FEATURE_DYNAMIC_FONT = 267;

    private static final BitSet sFeatures = new BitSet(269);

    static {
        File file = new File("/odm/etc/odm_feature_list");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                String[] values = line.split(" ");
                if (values.length == 4 && values[3].equals("true")) {
                    String id = values[0].replaceAll("[^0-9]", "");
                    if (id.length() != 0) {
                        sFeatures.set(Integer.parseInt(id));
                    }
                }
            }
        } catch (IOException e) {
            Log.e(LOG_TAG, "Failed to read odm feature list file", e);
        }
    }

    public static boolean isSupport(int... features) {
        for (int feature : features) {
            if (feature < 0 || feature > sFeatures.length()) {
                return false;
            }
            if (!sFeatures.get(feature)) {
                return false;
            }
        }
        return true;
    }
}
