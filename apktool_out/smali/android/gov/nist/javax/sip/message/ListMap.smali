.class public Landroid/gov/nist/javax/sip/message/ListMap;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static headerListTable:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field private static initialized:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Landroid/gov/nist/javax/sip/message/ListMap;->initializeListMap()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static addListHeader(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroid/gov/nist/javax/sip/header/SIPHeader;",
            ">;",
            "Ljava/lang/Class<",
            "+",
            "Landroid/gov/nist/javax/sip/header/SIPHeaderList<",
            "+",
            "Landroid/gov/nist/javax/sip/header/SIPHeader;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static getList(Landroid/gov/nist/javax/sip/header/SIPHeader;)Landroid/gov/nist/javax/sip/header/SIPHeaderList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/gov/nist/javax/sip/header/SIPHeader;",
            ")",
            "Landroid/gov/nist/javax/sip/header/SIPHeaderList<",
            "Landroid/gov/nist/javax/sip/header/SIPHeader;",
            ">;"
        }
    .end annotation

    .line 1
    sget-boolean v0, Landroid/gov/nist/javax/sip/message/ListMap;->initialized:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Landroid/gov/nist/javax/sip/message/ListMap;->initializeListMap()V

    .line 6
    .line 7
    .line 8
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 13
    .line 14
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/Class;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/SIPHeader;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/header/SIPHeader;->setHeaderName(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :catch_0
    move-exception p0

    .line 35
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catch_1
    move-exception p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 41
    .line 42
    .line 43
    :goto_0
    const/4 p0, 0x0

    .line 44
    return-object p0
.end method

.method public static getListClass(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    sget-boolean v0, Landroid/gov/nist/javax/sip/message/ListMap;->initialized:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Landroid/gov/nist/javax/sip/message/ListMap;->initializeListMap()V

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ljava/lang/Class;

    .line 15
    .line 16
    return-object p0
.end method

.method public static hasList(Landroid/gov/nist/javax/sip/header/SIPHeader;)Z
    .locals 2

    .line 1
    instance-of v0, p0, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_1
    return v1
.end method

.method public static hasList(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 22
    sget-boolean v0, Landroid/gov/nist/javax/sip/message/ListMap;->initialized:Z

    if-nez v0, :cond_0

    .line 23
    invoke-static {}, Landroid/gov/nist/javax/sip/message/ListMap;->initializeListMap()V

    .line 24
    :cond_0
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private static initializeListMap()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 9
    .line 10
    const-class v1, Landroid/gov/nist/javax/sip/header/ExtensionHeaderImpl;

    .line 11
    .line 12
    const-class v2, Landroid/gov/nist/javax/sip/header/ExtensionHeaderList;

    .line 13
    .line 14
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 18
    .line 19
    const-class v1, Landroid/gov/nist/javax/sip/header/Contact;

    .line 20
    .line 21
    const-class v2, Landroid/gov/nist/javax/sip/header/ContactList;

    .line 22
    .line 23
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 27
    .line 28
    const-class v1, Landroid/gov/nist/javax/sip/header/ContentEncoding;

    .line 29
    .line 30
    const-class v2, Landroid/gov/nist/javax/sip/header/ContentEncodingList;

    .line 31
    .line 32
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 36
    .line 37
    const-class v1, Landroid/gov/nist/javax/sip/header/Via;

    .line 38
    .line 39
    const-class v2, Landroid/gov/nist/javax/sip/header/ViaList;

    .line 40
    .line 41
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 45
    .line 46
    const-class v1, Landroid/gov/nist/javax/sip/header/WWWAuthenticate;

    .line 47
    .line 48
    const-class v2, Landroid/gov/nist/javax/sip/header/WWWAuthenticateList;

    .line 49
    .line 50
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 54
    .line 55
    const-class v1, Landroid/gov/nist/javax/sip/header/Accept;

    .line 56
    .line 57
    const-class v2, Landroid/gov/nist/javax/sip/header/AcceptList;

    .line 58
    .line 59
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 63
    .line 64
    const-class v1, Landroid/gov/nist/javax/sip/header/AcceptEncoding;

    .line 65
    .line 66
    const-class v2, Landroid/gov/nist/javax/sip/header/AcceptEncodingList;

    .line 67
    .line 68
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 72
    .line 73
    const-class v1, Landroid/gov/nist/javax/sip/header/AcceptLanguage;

    .line 74
    .line 75
    const-class v2, Landroid/gov/nist/javax/sip/header/AcceptLanguageList;

    .line 76
    .line 77
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 81
    .line 82
    const-class v1, Landroid/gov/nist/javax/sip/header/ProxyRequire;

    .line 83
    .line 84
    const-class v2, Landroid/gov/nist/javax/sip/header/ProxyRequireList;

    .line 85
    .line 86
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 90
    .line 91
    const-class v1, Landroid/gov/nist/javax/sip/header/Route;

    .line 92
    .line 93
    const-class v2, Landroid/gov/nist/javax/sip/header/RouteList;

    .line 94
    .line 95
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 99
    .line 100
    const-class v1, Landroid/gov/nist/javax/sip/header/Require;

    .line 101
    .line 102
    const-class v2, Landroid/gov/nist/javax/sip/header/RequireList;

    .line 103
    .line 104
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 108
    .line 109
    const-class v1, Landroid/gov/nist/javax/sip/header/Warning;

    .line 110
    .line 111
    const-class v2, Landroid/gov/nist/javax/sip/header/WarningList;

    .line 112
    .line 113
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 117
    .line 118
    const-class v1, Landroid/gov/nist/javax/sip/header/Unsupported;

    .line 119
    .line 120
    const-class v2, Landroid/gov/nist/javax/sip/header/UnsupportedList;

    .line 121
    .line 122
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 126
    .line 127
    const-class v1, Landroid/gov/nist/javax/sip/header/AlertInfo;

    .line 128
    .line 129
    const-class v2, Landroid/gov/nist/javax/sip/header/AlertInfoList;

    .line 130
    .line 131
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 135
    .line 136
    const-class v1, Landroid/gov/nist/javax/sip/header/CallInfo;

    .line 137
    .line 138
    const-class v2, Landroid/gov/nist/javax/sip/header/CallInfoList;

    .line 139
    .line 140
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 144
    .line 145
    const-class v1, Landroid/gov/nist/javax/sip/header/ProxyAuthenticate;

    .line 146
    .line 147
    const-class v2, Landroid/gov/nist/javax/sip/header/ProxyAuthenticateList;

    .line 148
    .line 149
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 153
    .line 154
    const-class v1, Landroid/gov/nist/javax/sip/header/ProxyAuthorization;

    .line 155
    .line 156
    const-class v2, Landroid/gov/nist/javax/sip/header/ProxyAuthorizationList;

    .line 157
    .line 158
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 162
    .line 163
    const-class v1, Landroid/gov/nist/javax/sip/header/Authorization;

    .line 164
    .line 165
    const-class v2, Landroid/gov/nist/javax/sip/header/AuthorizationList;

    .line 166
    .line 167
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 171
    .line 172
    const-class v1, Landroid/gov/nist/javax/sip/header/Allow;

    .line 173
    .line 174
    const-class v2, Landroid/gov/nist/javax/sip/header/AllowList;

    .line 175
    .line 176
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 180
    .line 181
    const-class v1, Landroid/gov/nist/javax/sip/header/AllowEvents;

    .line 182
    .line 183
    const-class v2, Landroid/gov/nist/javax/sip/header/AllowEventsList;

    .line 184
    .line 185
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 189
    .line 190
    const-class v1, Landroid/gov/nist/javax/sip/header/RecordRoute;

    .line 191
    .line 192
    const-class v2, Landroid/gov/nist/javax/sip/header/RecordRouteList;

    .line 193
    .line 194
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 198
    .line 199
    const-class v1, Landroid/gov/nist/javax/sip/header/ContentLanguage;

    .line 200
    .line 201
    const-class v2, Landroid/gov/nist/javax/sip/header/ContentLanguageList;

    .line 202
    .line 203
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 207
    .line 208
    const-class v1, Landroid/gov/nist/javax/sip/header/ErrorInfo;

    .line 209
    .line 210
    const-class v2, Landroid/gov/nist/javax/sip/header/ErrorInfoList;

    .line 211
    .line 212
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 216
    .line 217
    const-class v1, Landroid/gov/nist/javax/sip/header/Supported;

    .line 218
    .line 219
    const-class v2, Landroid/gov/nist/javax/sip/header/SupportedList;

    .line 220
    .line 221
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 225
    .line 226
    const-class v1, Landroid/gov/nist/javax/sip/header/InReplyTo;

    .line 227
    .line 228
    const-class v2, Landroid/gov/nist/javax/sip/header/InReplyToList;

    .line 229
    .line 230
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 234
    .line 235
    const-class v1, Landroid/gov/nist/javax/sip/header/ims/PAssociatedURI;

    .line 236
    .line 237
    const-class v2, Landroid/gov/nist/javax/sip/header/ims/PAssociatedURIList;

    .line 238
    .line 239
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 243
    .line 244
    const-class v1, Landroid/gov/nist/javax/sip/header/ims/PMediaAuthorization;

    .line 245
    .line 246
    const-class v2, Landroid/gov/nist/javax/sip/header/ims/PMediaAuthorizationList;

    .line 247
    .line 248
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 252
    .line 253
    const-class v1, Landroid/gov/nist/javax/sip/header/ims/Path;

    .line 254
    .line 255
    const-class v2, Landroid/gov/nist/javax/sip/header/ims/PathList;

    .line 256
    .line 257
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 261
    .line 262
    const-class v1, Landroid/gov/nist/javax/sip/header/ims/Privacy;

    .line 263
    .line 264
    const-class v2, Landroid/gov/nist/javax/sip/header/ims/PrivacyList;

    .line 265
    .line 266
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 270
    .line 271
    const-class v1, Landroid/gov/nist/javax/sip/header/ims/ServiceRoute;

    .line 272
    .line 273
    const-class v2, Landroid/gov/nist/javax/sip/header/ims/ServiceRouteList;

    .line 274
    .line 275
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 279
    .line 280
    const-class v1, Landroid/gov/nist/javax/sip/header/ims/PVisitedNetworkID;

    .line 281
    .line 282
    const-class v2, Landroid/gov/nist/javax/sip/header/ims/PVisitedNetworkIDList;

    .line 283
    .line 284
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 288
    .line 289
    const-class v1, Landroid/gov/nist/javax/sip/header/ims/SecurityClient;

    .line 290
    .line 291
    const-class v2, Landroid/gov/nist/javax/sip/header/ims/SecurityClientList;

    .line 292
    .line 293
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 297
    .line 298
    const-class v1, Landroid/gov/nist/javax/sip/header/ims/SecurityServer;

    .line 299
    .line 300
    const-class v2, Landroid/gov/nist/javax/sip/header/ims/SecurityServerList;

    .line 301
    .line 302
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 306
    .line 307
    const-class v1, Landroid/gov/nist/javax/sip/header/ims/SecurityVerify;

    .line 308
    .line 309
    const-class v2, Landroid/gov/nist/javax/sip/header/ims/SecurityVerifyList;

    .line 310
    .line 311
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 315
    .line 316
    const-class v1, Landroid/gov/nist/javax/sip/header/ims/PAssertedIdentity;

    .line 317
    .line 318
    const-class v2, Landroid/gov/nist/javax/sip/header/ims/PAssertedIdentityList;

    .line 319
    .line 320
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    sget-object v0, Landroid/gov/nist/javax/sip/message/ListMap;->headerListTable:Ljava/util/Map;

    .line 324
    .line 325
    const-class v1, Landroid/gov/nist/javax/sip/header/Reason;

    .line 326
    .line 327
    const-class v2, Landroid/gov/nist/javax/sip/header/ReasonList;

    .line 328
    .line 329
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    const/4 v0, 0x1

    .line 333
    sput-boolean v0, Landroid/gov/nist/javax/sip/message/ListMap;->initialized:Z

    .line 334
    .line 335
    return-void
.end method
