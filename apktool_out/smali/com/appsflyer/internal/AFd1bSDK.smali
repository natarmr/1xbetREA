.class public final enum Lcom/appsflyer/internal/AFd1bSDK;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFe1zSDK;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFd1bSDK$AFa1vSDK;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/internal/AFd1bSDK;",
        ">;",
        "Lcom/appsflyer/internal/AFe1zSDK;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u001a\u0008\u0086\u0001\u0018\u0000 \u000c2\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000cB\u0011\u0008\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00038\u0017X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000bj\u0002\u0008\tj\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001d"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFd1bSDK;",
        "Lcom/appsflyer/internal/AFe1zSDK;",
        "",
        "",
        "p0",
        "<init>",
        "(Ljava/lang/String;II)V",
        "getEntries",
        "I",
        "AFLogger",
        "()I",
        "unregisterClient",
        "AFa1vSDK",
        "d",
        "AFKeystoreWrapper",
        "registerClient",
        "v",
        "i",
        "force",
        "e",
        "w",
        "afDebugLog",
        "afInfoLog",
        "afErrorLog",
        "AFLoggerLogLevel",
        "afWarnLog",
        "values",
        "AppsFlyerLib",
        "getLevel",
        "valueOf"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum AFKeystoreWrapper:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum AFLogger:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum AFLoggerLogLevel:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final AFa1vSDK:Lcom/appsflyer/internal/AFd1bSDK$AFa1vSDK;

.field public static final enum AppsFlyerLib:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum afDebugLog:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum afErrorLog:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum afInfoLog:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum afWarnLog:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum d:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum e:Lcom/appsflyer/internal/AFd1bSDK;

.field private static final synthetic enableTCFDataCollection:[Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum force:Lcom/appsflyer/internal/AFd1bSDK;

.field private static final synthetic getInstance:La/a0o;

.field public static final enum getLevel:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum i:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum registerClient:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum unregisterClient:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum v:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum valueOf:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum values:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum w:Lcom/appsflyer/internal/AFd1bSDK;


# instance fields
.field private final getEntries:I


# direct methods
.method static constructor <clinit>()V
    .locals 22

    .line 1
    new-instance v1, Lcom/appsflyer/internal/AFd1bSDK;

    .line 2
    .line 3
    const-string v0, "RC_CDN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v1, v0, v2, v3}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v1, Lcom/appsflyer/internal/AFd1bSDK;->d:Lcom/appsflyer/internal/AFd1bSDK;

    .line 11
    .line 12
    new-instance v2, Lcom/appsflyer/internal/AFd1bSDK;

    .line 13
    .line 14
    const-string v0, "FETCH_ADVERTISING_ID"

    .line 15
    .line 16
    invoke-direct {v2, v0, v3, v3}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v2, Lcom/appsflyer/internal/AFd1bSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFd1bSDK;

    .line 20
    .line 21
    new-instance v3, Lcom/appsflyer/internal/AFd1bSDK;

    .line 22
    .line 23
    const-string v0, "LOAD_CACHE"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v3, v0, v4, v4}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lcom/appsflyer/internal/AFd1bSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1bSDK;

    .line 30
    .line 31
    new-instance v0, Lcom/appsflyer/internal/AFd1bSDK;

    .line 32
    .line 33
    const-string v5, "CACHED_EVENT"

    .line 34
    .line 35
    const/4 v6, 0x3

    .line 36
    invoke-direct {v0, v5, v6, v4}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/appsflyer/internal/AFd1bSDK;->AFLogger:Lcom/appsflyer/internal/AFd1bSDK;

    .line 40
    .line 41
    new-instance v5, Lcom/appsflyer/internal/AFd1bSDK;

    .line 42
    .line 43
    const-string v7, "CONVERSION"

    .line 44
    .line 45
    const/4 v8, 0x4

    .line 46
    invoke-direct {v5, v7, v8, v4}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    sput-object v5, Lcom/appsflyer/internal/AFd1bSDK;->registerClient:Lcom/appsflyer/internal/AFd1bSDK;

    .line 50
    .line 51
    new-instance v7, Lcom/appsflyer/internal/AFd1bSDK;

    .line 52
    .line 53
    const-string v9, "PLAY_INTEGRITY_API"

    .line 54
    .line 55
    const/4 v10, 0x5

    .line 56
    invoke-direct {v7, v9, v10, v4}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    .line 57
    .line 58
    .line 59
    sput-object v7, Lcom/appsflyer/internal/AFd1bSDK;->v:Lcom/appsflyer/internal/AFd1bSDK;

    .line 60
    .line 61
    move-object v9, v7

    .line 62
    new-instance v7, Lcom/appsflyer/internal/AFd1bSDK;

    .line 63
    .line 64
    const-string v10, "ONELINK"

    .line 65
    .line 66
    const/4 v11, 0x6

    .line 67
    invoke-direct {v7, v10, v11, v4}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    .line 68
    .line 69
    .line 70
    sput-object v7, Lcom/appsflyer/internal/AFd1bSDK;->i:Lcom/appsflyer/internal/AFd1bSDK;

    .line 71
    .line 72
    new-instance v10, Lcom/appsflyer/internal/AFd1bSDK;

    .line 73
    .line 74
    const-string v11, "DLSDK"

    .line 75
    .line 76
    const/4 v12, 0x7

    .line 77
    invoke-direct {v10, v11, v12, v4}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    .line 78
    .line 79
    .line 80
    sput-object v10, Lcom/appsflyer/internal/AFd1bSDK;->force:Lcom/appsflyer/internal/AFd1bSDK;

    .line 81
    .line 82
    move-object v11, v9

    .line 83
    new-instance v9, Lcom/appsflyer/internal/AFd1bSDK;

    .line 84
    .line 85
    const-string v12, "RESOLVE_ESP"

    .line 86
    .line 87
    const/16 v13, 0x8

    .line 88
    .line 89
    invoke-direct {v9, v12, v13, v4}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    .line 90
    .line 91
    .line 92
    sput-object v9, Lcom/appsflyer/internal/AFd1bSDK;->e:Lcom/appsflyer/internal/AFd1bSDK;

    .line 93
    .line 94
    move-object v12, v10

    .line 95
    new-instance v10, Lcom/appsflyer/internal/AFd1bSDK;

    .line 96
    .line 97
    const-string v13, "ATTR"

    .line 98
    .line 99
    const/16 v14, 0x9

    .line 100
    .line 101
    invoke-direct {v10, v13, v14, v4}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    .line 102
    .line 103
    .line 104
    sput-object v10, Lcom/appsflyer/internal/AFd1bSDK;->w:Lcom/appsflyer/internal/AFd1bSDK;

    .line 105
    .line 106
    move-object v4, v11

    .line 107
    new-instance v11, Lcom/appsflyer/internal/AFd1bSDK;

    .line 108
    .line 109
    const-string v13, "GCDSDK"

    .line 110
    .line 111
    const/16 v14, 0xa

    .line 112
    .line 113
    invoke-direct {v11, v13, v14, v6}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    .line 114
    .line 115
    .line 116
    sput-object v11, Lcom/appsflyer/internal/AFd1bSDK;->afDebugLog:Lcom/appsflyer/internal/AFd1bSDK;

    .line 117
    .line 118
    move-object v6, v12

    .line 119
    new-instance v12, Lcom/appsflyer/internal/AFd1bSDK;

    .line 120
    .line 121
    const-string v13, "REGISTER"

    .line 122
    .line 123
    const/16 v14, 0xb

    .line 124
    .line 125
    invoke-direct {v12, v13, v14, v8}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    .line 126
    .line 127
    .line 128
    sput-object v12, Lcom/appsflyer/internal/AFd1bSDK;->afInfoLog:Lcom/appsflyer/internal/AFd1bSDK;

    .line 129
    .line 130
    new-instance v13, Lcom/appsflyer/internal/AFd1bSDK;

    .line 131
    .line 132
    const-string v14, "LAUNCH"

    .line 133
    .line 134
    const/16 v15, 0xc

    .line 135
    .line 136
    invoke-direct {v13, v14, v15, v8}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    .line 137
    .line 138
    .line 139
    sput-object v13, Lcom/appsflyer/internal/AFd1bSDK;->afErrorLog:Lcom/appsflyer/internal/AFd1bSDK;

    .line 140
    .line 141
    new-instance v14, Lcom/appsflyer/internal/AFd1bSDK;

    .line 142
    .line 143
    const-string v15, "INAPP"

    .line 144
    .line 145
    move-object/from16 v16, v0

    .line 146
    .line 147
    const/16 v0, 0xd

    .line 148
    .line 149
    invoke-direct {v14, v15, v0, v8}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    .line 150
    .line 151
    .line 152
    sput-object v14, Lcom/appsflyer/internal/AFd1bSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFd1bSDK;

    .line 153
    .line 154
    new-instance v15, Lcom/appsflyer/internal/AFd1bSDK;

    .line 155
    .line 156
    const-string v0, "MANUAL_PURCHASE_VALIDATION"

    .line 157
    .line 158
    move-object/from16 v17, v1

    .line 159
    .line 160
    const/16 v1, 0xe

    .line 161
    .line 162
    invoke-direct {v15, v0, v1, v8}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    .line 163
    .line 164
    .line 165
    sput-object v15, Lcom/appsflyer/internal/AFd1bSDK;->afWarnLog:Lcom/appsflyer/internal/AFd1bSDK;

    .line 166
    .line 167
    new-instance v0, Lcom/appsflyer/internal/AFd1bSDK;

    .line 168
    .line 169
    const-string v1, "PURCHASE_VALIDATE"

    .line 170
    .line 171
    move-object/from16 v18, v2

    .line 172
    .line 173
    const/16 v2, 0xf

    .line 174
    .line 175
    invoke-direct {v0, v1, v2, v8}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    .line 176
    .line 177
    .line 178
    sput-object v0, Lcom/appsflyer/internal/AFd1bSDK;->values:Lcom/appsflyer/internal/AFd1bSDK;

    .line 179
    .line 180
    new-instance v1, Lcom/appsflyer/internal/AFd1bSDK;

    .line 181
    .line 182
    const-string v2, "IMPRESSIONS"

    .line 183
    .line 184
    move-object/from16 v19, v0

    .line 185
    .line 186
    const/16 v0, 0x10

    .line 187
    .line 188
    invoke-direct {v1, v2, v0, v8}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    .line 189
    .line 190
    .line 191
    sput-object v1, Lcom/appsflyer/internal/AFd1bSDK;->AppsFlyerLib:Lcom/appsflyer/internal/AFd1bSDK;

    .line 192
    .line 193
    new-instance v0, Lcom/appsflyer/internal/AFd1bSDK;

    .line 194
    .line 195
    const-string v2, "ARS_VALIDATE"

    .line 196
    .line 197
    move-object/from16 v20, v1

    .line 198
    .line 199
    const/16 v1, 0x11

    .line 200
    .line 201
    invoke-direct {v0, v2, v1, v8}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    .line 202
    .line 203
    .line 204
    sput-object v0, Lcom/appsflyer/internal/AFd1bSDK;->getLevel:Lcom/appsflyer/internal/AFd1bSDK;

    .line 205
    .line 206
    new-instance v1, Lcom/appsflyer/internal/AFd1bSDK;

    .line 207
    .line 208
    const-string v2, "ADREVENUE"

    .line 209
    .line 210
    move-object/from16 v21, v0

    .line 211
    .line 212
    const/16 v0, 0x12

    .line 213
    .line 214
    invoke-direct {v1, v2, v0, v8}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    .line 215
    .line 216
    .line 217
    sput-object v1, Lcom/appsflyer/internal/AFd1bSDK;->valueOf:Lcom/appsflyer/internal/AFd1bSDK;

    .line 218
    .line 219
    move-object v8, v6

    .line 220
    move-object/from16 v2, v18

    .line 221
    .line 222
    move-object/from16 v18, v21

    .line 223
    .line 224
    move-object v6, v4

    .line 225
    move-object/from16 v4, v16

    .line 226
    .line 227
    move-object/from16 v16, v19

    .line 228
    .line 229
    move-object/from16 v19, v1

    .line 230
    .line 231
    move-object/from16 v1, v17

    .line 232
    .line 233
    move-object/from16 v17, v20

    .line 234
    .line 235
    filled-new-array/range {v1 .. v19}, [Lcom/appsflyer/internal/AFd1bSDK;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    sput-object v0, Lcom/appsflyer/internal/AFd1bSDK;->enableTCFDataCollection:[Lcom/appsflyer/internal/AFd1bSDK;

    .line 240
    .line 241
    new-instance v1, La/c0o;

    .line 242
    .line 243
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 244
    .line 245
    .line 246
    sput-object v1, Lcom/appsflyer/internal/AFd1bSDK;->getInstance:La/a0o;

    .line 247
    .line 248
    new-instance v0, Lcom/appsflyer/internal/AFd1bSDK$AFa1vSDK;

    .line 249
    .line 250
    const/4 v1, 0x0

    .line 251
    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFd1bSDK$AFa1vSDK;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 252
    .line 253
    .line 254
    sput-object v0, Lcom/appsflyer/internal/AFd1bSDK;->AFa1vSDK:Lcom/appsflyer/internal/AFd1bSDK$AFa1vSDK;

    .line 255
    .line 256
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/appsflyer/internal/AFd1bSDK;->getEntries:I

    .line 5
    .line 6
    return-void
.end method

.method public static registerClient()La/a0o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La/a0o;"
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->getInstance:La/a0o;

    return-object v0
.end method

.method public static final registerClient(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1bSDK;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFd1bSDK$AFa1vSDK;->registerClient(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1bSDK;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1bSDK;
    .locals 1

    .line 1
    const-class v0, Lcom/appsflyer/internal/AFd1bSDK;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/appsflyer/internal/AFd1bSDK;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/appsflyer/internal/AFd1bSDK;
    .locals 1

    .line 1
    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->enableTCFDataCollection:[Lcom/appsflyer/internal/AFd1bSDK;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/appsflyer/internal/AFd1bSDK;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final AFLogger()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/appsflyer/internal/AFd1bSDK;->getEntries:I

    .line 2
    .line 3
    return p0
.end method

.method public final synthetic unregisterClient()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
