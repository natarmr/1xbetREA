.class public Landroid/gov/nist/javax/sip/message/SIPRequest;
.super Landroid/gov/nist/javax/sip/message/SIPMessage;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/message/Request;
.implements Landroid/gov/nist/javax/sip/message/RequestExt;


# static fields
.field private static final DEFAULT_TRANSPORT:Ljava/lang/String; = "udp"

.field private static final DEFAULT_USER:Ljava/lang/String; = "ip"

.field protected static final headersToIncludeInResponse:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final nameTable:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = 0x2ea3ad0be6d281afL

.field private static final targetRefreshMethods:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private transient inviteTransaction:Ljava/lang/Object;

.field private transient messageChannel:Ljava/lang/Object;

.field protected requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

.field private transient transactionPointer:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroid/gov/nist/javax/sip/message/SIPRequest;->targetRefreshMethods:Ljava/util/Set;

    .line 7
    .line 8
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    const/16 v2, 0xf

    .line 11
    .line 12
    invoke-direct {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v1, Landroid/gov/nist/javax/sip/message/SIPRequest;->nameTable:Ljava/util/Map;

    .line 16
    .line 17
    new-instance v1, Ljava/util/HashSet;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Landroid/gov/nist/javax/sip/message/SIPRequest;->headersToIncludeInResponse:Ljava/util/Set;

    .line 24
    .line 25
    const-string v2, "INVITE"

    .line 26
    .line 27
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    const-string v3, "UPDATE"

    .line 31
    .line 32
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    const-string v4, "SUBSCRIBE"

    .line 36
    .line 37
    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    const-string v5, "NOTIFY"

    .line 41
    .line 42
    invoke-interface {v0, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    const-string v6, "REFER"

    .line 46
    .line 47
    invoke-interface {v0, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    invoke-static {v2}, Landroid/gov/nist/javax/sip/message/SIPRequest;->putName(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string v0, "BYE"

    .line 54
    .line 55
    invoke-static {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->putName(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const-string v0, "CANCEL"

    .line 59
    .line 60
    invoke-static {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->putName(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string v0, "ACK"

    .line 64
    .line 65
    invoke-static {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->putName(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v0, "PRACK"

    .line 69
    .line 70
    invoke-static {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->putName(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v2, "INFO"

    .line 74
    .line 75
    invoke-static {v2}, Landroid/gov/nist/javax/sip/message/SIPRequest;->putName(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-string v2, "MESSAGE"

    .line 79
    .line 80
    invoke-static {v2}, Landroid/gov/nist/javax/sip/message/SIPRequest;->putName(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v5}, Landroid/gov/nist/javax/sip/message/SIPRequest;->putName(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const-string v2, "OPTIONS"

    .line 87
    .line 88
    invoke-static {v2}, Landroid/gov/nist/javax/sip/message/SIPRequest;->putName(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->putName(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const-string v0, "PUBLISH"

    .line 95
    .line 96
    invoke-static {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->putName(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v6}, Landroid/gov/nist/javax/sip/message/SIPRequest;->putName(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const-string v0, "REGISTER"

    .line 103
    .line 104
    invoke-static {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->putName(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v4}, Landroid/gov/nist/javax/sip/message/SIPRequest;->putName(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v3}, Landroid/gov/nist/javax/sip/message/SIPRequest;->putName(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const-string v0, "From"

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    const-string v0, "To"

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    const-string v0, "Via"

    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    const-string v0, "Record-Route"

    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    const-string v0, "Call-ID"

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    const-string v0, "CSeq"

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    const-string v0, "Timestamp"

    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static getCannonicalName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/message/SIPRequest;->nameTable:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/lang/String;

    .line 14
    .line 15
    :cond_0
    return-object p0
.end method

.method public static isDialogCreating(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDialogCreated(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static isTargetRefresh(Ljava/lang/String;)Z
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/message/SIPRequest;->targetRefreshMethods:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method private static putName(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/message/SIPRequest;->nameTable:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public checkHeaders()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_f

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTo()Landroid/javax/sip/header/ToHeader;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_e

    .line 13
    .line 14
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->callIdHeader:Landroid/gov/nist/javax/sip/header/CallID;

    .line 15
    .line 16
    if-eqz v0, :cond_d

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/CallID;->getCallId()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_d

    .line 23
    .line 24
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->callIdHeader:Landroid/gov/nist/javax/sip/header/CallID;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/CallID;->getCallId()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v2, ""

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_d

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFrom()Landroid/javax/sip/header/FromHeader;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_c

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getViaHeaders()Landroid/gov/nist/javax/sip/header/ViaList;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_b

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getMaxForwards()Landroid/javax/sip/header/MaxForwardsHeader;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_a

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_9

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-string v2, "NOTIFY"

    .line 67
    .line 68
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    const-string v2, "Missing a required header : Event"

    .line 73
    .line 74
    const-string v3, "Event"

    .line 75
    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    const-string v0, "Subscription-State"

    .line 79
    .line 80
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    if-eqz v0, :cond_1

    .line 85
    .line 86
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFromHeader()Landroid/javax/sip/header/FromHeader;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-interface {v0}, Landroid/javax/sip/header/FromHeader;->getTag()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-eqz v0, :cond_4

    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToHeader()Landroid/javax/sip/header/ToHeader;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-interface {v0}, Landroid/javax/sip/header/ToHeader;->getTag()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-eqz v0, :cond_4

    .line 105
    .line 106
    invoke-virtual {p0, v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    if-eqz v0, :cond_0

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_0
    invoke-static {v1, v2}, La/hny;->j(ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_1
    const-string p0, "Missing a required header : Subscription-State"

    .line 118
    .line 119
    invoke-static {v1, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_2
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const-string v4, "PUBLISH"

    .line 128
    .line 129
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_4

    .line 134
    .line 135
    invoke-virtual {p0, v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    if-eqz v0, :cond_3

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_3
    invoke-static {v1, v2}, La/hny;->j(ILjava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_4
    :goto_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 147
    .line 148
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/RequestLine;->getMethod()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDialogCreated(Ljava/lang/String;)Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    if-eqz v2, :cond_6

    .line 157
    .line 158
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContactHeader()Landroid/gov/nist/javax/sip/header/Contact;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    if-nez v2, :cond_6

    .line 163
    .line 164
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    if-eqz v2, :cond_5

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_5
    const-string p0, "Missing a required header : Contact"

    .line 172
    .line 173
    invoke-static {v1, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :cond_6
    :goto_1
    iget-object v2, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 178
    .line 179
    if-eqz v2, :cond_8

    .line 180
    .line 181
    if-eqz v0, :cond_8

    .line 182
    .line 183
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-interface {v2}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    if-eqz v2, :cond_8

    .line 192
    .line 193
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    invoke-interface {p0}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-virtual {v0, p0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 202
    .line 203
    .line 204
    move-result p0

    .line 205
    if-nez p0, :cond_7

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_7
    const-string p0, "CSEQ method mismatch with  Request-Line "

    .line 209
    .line 210
    invoke-static {v1, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 211
    .line 212
    .line 213
    :cond_8
    :goto_2
    return-void

    .line 214
    :cond_9
    const-string p0, "No via header in request! "

    .line 215
    .line 216
    invoke-static {v1, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 217
    .line 218
    .line 219
    return-void

    .line 220
    :cond_a
    const-string p0, "Missing a required header : Max-Forwards"

    .line 221
    .line 222
    invoke-static {v1, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 223
    .line 224
    .line 225
    return-void

    .line 226
    :cond_b
    const-string p0, "Missing a required header : Via"

    .line 227
    .line 228
    invoke-static {v1, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :cond_c
    const-string p0, "Missing a required header : From"

    .line 233
    .line 234
    invoke-static {v1, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    :cond_d
    const-string p0, "Missing a required header : Call-ID"

    .line 239
    .line 240
    invoke-static {v1, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :cond_e
    const-string p0, "Missing a required header : To"

    .line 245
    .line 246
    invoke-static {v1, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :cond_f
    const-string p0, "Missing a required header : CSeq"

    .line 251
    .line 252
    invoke-static {v1, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 253
    .line 254
    .line 255
    return-void
.end method

.method public cleanUp()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->cleanUp()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-object v1, v0, Landroid/gov/nist/javax/sip/message/SIPRequest;->transactionPointer:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/RequestLine;->clone()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 19
    .line 20
    iput-object p0, v0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 21
    .line 22
    :cond_0
    return-object v0
.end method

.method public createAckRequest(Landroid/gov/nist/javax/sip/header/To;)Landroid/gov/nist/javax/sip/message/SIPRequest;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 6
    .line 7
    const-string v0, "ACK"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setMethod(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "Route"

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->removeHeader(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v1, "Proxy-Authorization"

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->removeHeader(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->removeContent()V

    .line 23
    .line 24
    .line 25
    const-string v1, "Content-Type"

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->removeHeader(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :try_start_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1, v0}, Landroid/javax/sip/header/CSeqHeader;->setMethod(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    :catch_0
    if-eqz p1, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setTo(Landroid/javax/sip/header/ToHeader;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    const-string p1, "Contact"

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->removeHeader(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-string p1, "Expires"

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->removeHeader(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getViaHeaders()Landroid/gov/nist/javax/sip/header/ViaList;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->size()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    const/4 v1, 0x1

    .line 63
    if-le v0, v1, :cond_1

    .line 64
    .line 65
    const/4 v0, 0x2

    .line 66
    :goto_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->size()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-ge v0, v1, :cond_1

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->remove(I)Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 73
    .line 74
    .line 75
    add-int/lit8 v0, v0, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultUserAgentHeader()Landroid/javax/sip/header/UserAgentHeader;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-eqz p1, :cond_2

    .line 83
    .line 84
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultUserAgentHeader()Landroid/javax/sip/header/UserAgentHeader;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 89
    .line 90
    .line 91
    :cond_2
    return-object p0
.end method

.method public createCancelRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "INVITE"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    new-instance v0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 14
    .line 15
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/RequestLine;->clone()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setRequestLine(Landroid/gov/nist/javax/sip/header/RequestLine;)V

    .line 27
    .line 28
    .line 29
    const-string v1, "CANCEL"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setMethod(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->callIdHeader:Landroid/gov/nist/javax/sip/header/CallID;

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/header/CallID;->clone()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Landroid/javax/sip/header/Header;

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 43
    .line 44
    .line 45
    iget-object v2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->toHeader:Landroid/gov/nist/javax/sip/header/To;

    .line 46
    .line 47
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->clone()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Landroid/javax/sip/header/Header;

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 54
    .line 55
    .line 56
    iget-object v2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->cSeqHeader:Landroid/gov/nist/javax/sip/header/CSeq;

    .line 57
    .line 58
    invoke-virtual {v2}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, Landroid/javax/sip/header/Header;

    .line 63
    .line 64
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 65
    .line 66
    .line 67
    :try_start_0
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-interface {v2, v1}, Landroid/javax/sip/header/CSeqHeader;->setMethod(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catch_0
    move-exception v1

    .line 76
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 77
    .line 78
    .line 79
    :goto_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->fromHeader:Landroid/gov/nist/javax/sip/header/From;

    .line 80
    .line 81
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->clone()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, Landroid/javax/sip/header/Header;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/Via;->clone()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, Landroid/javax/sip/header/Header;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->addFirst(Landroid/javax/sip/header/Header;)V

    .line 101
    .line 102
    .line 103
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->maxForwardsHeader:Landroid/gov/nist/javax/sip/header/MaxForwards;

    .line 104
    .line 105
    invoke-virtual {v1}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    check-cast v1, Landroid/javax/sip/header/Header;

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRouteHeaders()Landroid/gov/nist/javax/sip/header/RouteList;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    if-eqz v1, :cond_0

    .line 119
    .line 120
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRouteHeaders()Landroid/gov/nist/javax/sip/header/RouteList;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/RouteList;->clone()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    check-cast p0, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 129
    .line 130
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 131
    .line 132
    .line 133
    :cond_0
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultUserAgentHeader()Landroid/javax/sip/header/UserAgentHeader;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    if-eqz p0, :cond_1

    .line 138
    .line 139
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultUserAgentHeader()Landroid/javax/sip/header/UserAgentHeader;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 144
    .line 145
    .line 146
    :cond_1
    return-object v0

    .line 147
    :cond_2
    new-instance v0, Landroid/javax/sip/SipException;

    .line 148
    .line 149
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    new-instance v1, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    const-string v2, "Attempt to create CANCEL for "

    .line 156
    .line 157
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-direct {v0, p0}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw v0
.end method

.method public final createErrorAck(Landroid/gov/nist/javax/sip/header/To;)Landroid/gov/nist/javax/sip/message/SIPRequest;
    .locals 3

    .line 1
    new-instance v0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/RequestLine;->clone()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setRequestLine(Landroid/gov/nist/javax/sip/header/RequestLine;)V

    .line 15
    .line 16
    .line 17
    const-string v1, "ACK"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setMethod(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->callIdHeader:Landroid/gov/nist/javax/sip/header/CallID;

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/header/CallID;->clone()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Landroid/javax/sip/header/Header;

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->maxForwardsHeader:Landroid/gov/nist/javax/sip/header/MaxForwards;

    .line 34
    .line 35
    invoke-virtual {v2}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Landroid/javax/sip/header/Header;

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->fromHeader:Landroid/gov/nist/javax/sip/header/From;

    .line 45
    .line 46
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->clone()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Landroid/javax/sip/header/Header;

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->clone()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Landroid/javax/sip/header/Header;

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/header/Via;->clone()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Landroid/javax/sip/header/Header;

    .line 73
    .line 74
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->addFirst(Landroid/javax/sip/header/Header;)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->cSeqHeader:Landroid/gov/nist/javax/sip/header/CSeq;

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, Landroid/javax/sip/header/Header;

    .line 84
    .line 85
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-interface {p1, v1}, Landroid/javax/sip/header/CSeqHeader;->setMethod(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRouteHeaders()Landroid/gov/nist/javax/sip/header/RouteList;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-eqz p1, :cond_0

    .line 100
    .line 101
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRouteHeaders()Landroid/gov/nist/javax/sip/header/RouteList;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/RouteList;->clone()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    check-cast p0, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 110
    .line 111
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/gov/nist/javax/sip/header/SIPHeaderList;)V

    .line 112
    .line 113
    .line 114
    :cond_0
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultUserAgentHeader()Landroid/javax/sip/header/UserAgentHeader;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    if-eqz p0, :cond_1

    .line 119
    .line 120
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultUserAgentHeader()Landroid/javax/sip/header/UserAgentHeader;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 125
    .line 126
    .line 127
    :cond_1
    return-object v0
.end method

.method public createResponse(I)Landroid/gov/nist/javax/sip/message/SIPResponse;
    .locals 1

    .line 112
    invoke-static {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getReasonPhrase(I)Ljava/lang/String;

    move-result-object v0

    .line 113
    invoke-virtual {p0, p1, v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createResponse(ILjava/lang/String;)Landroid/gov/nist/javax/sip/message/SIPResponse;

    move-result-object p0

    return-object p0
.end method

.method public createResponse(ILjava/lang/String;)Landroid/gov/nist/javax/sip/message/SIPResponse;
    .locals 3

    .line 1
    new-instance v0, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/message/SIPResponse;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->setStatusCode(I)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_1

    .line 7
    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p2}, Landroid/gov/nist/javax/sip/message/SIPResponse;->setReasonPhrase(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getReasonPhrase(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {v0, p2}, Landroid/gov/nist/javax/sip/message/SIPResponse;->setReasonPhrase(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    sget-object p2, Landroid/gov/nist/javax/sip/message/SIPRequest;->headersToIncludeInResponse:Ljava/util/Set;

    .line 23
    .line 24
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/lang/String;

    .line 39
    .line 40
    iget-object v2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headerTable:Ljava/util/Map;

    .line 41
    .line 42
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 47
    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    instance-of v2, v1, Landroid/gov/nist/javax/sip/header/RecordRouteList;

    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->mustCopyRR(I)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    :cond_2
    :try_start_1
    invoke-virtual {v1}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    invoke-virtual {v0, v1, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->attachHeader(Landroid/gov/nist/javax/sip/header/SIPHeader;Z)V
    :try_end_1
    .catch Landroid/gov/nist/javax/sip/message/SIPDuplicateHeaderException; {:try_start_1 .. :try_end_1} :catch_0

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :catch_0
    move-exception v1

    .line 74
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultServerHeader()Landroid/javax/sip/header/ServerHeader;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    if-eqz p0, :cond_4

    .line 83
    .line 84
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultServerHeader()Landroid/javax/sip/header/ServerHeader;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultServerHeader()Landroid/javax/sip/header/ServerHeader;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    if-eqz p0, :cond_5

    .line 96
    .line 97
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 98
    .line 99
    .line 100
    :cond_5
    return-object v0

    .line 101
    :catch_1
    const-string p0, "Bad code "

    .line 102
    .line 103
    invoke-static {p1, p0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    const/4 p0, 0x0

    .line 111
    return-object p0
.end method

.method public debugDump()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->debugDump()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    iput-object v1, p0, Landroid/gov/nist/core/GenericObject;->stringRepresentation:Ljava/lang/String;

    .line 8
    .line 9
    const-class v1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/GenericObject;->sprint(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v1, "{"

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/GenericObject;->sprint(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/SIPObject;->debugDump()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/GenericObject;->sprint(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/GenericObject;->sprint(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v0, "}"

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/GenericObject;->sprint(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, Landroid/gov/nist/core/GenericObject;->stringRepresentation:Ljava/lang/String;

    .line 43
    .line 44
    return-object p0
.end method

.method public encode()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setRequestLineDefaults()V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/RequestLine;->encode()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-super {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->encode()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->isNullRequest()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    const-string p0, "\r\n\r\n"

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_1
    invoke-super {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->encode()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method public encodeAsBytes(Ljava/lang/String;)[B
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->isNullRequest()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p0, "\r\n\r\n"

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    new-array p0, v1, [B

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    if-eqz v0, :cond_2

    .line 23
    .line 24
    :try_start_0
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/RequestLine;->encode()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v2, "UTF-8"

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 31
    .line 32
    .line 33
    move-result-object v0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    goto :goto_0

    .line 35
    :catch_0
    move-exception v0

    .line 36
    invoke-static {v0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    const/4 v0, 0x0

    .line 40
    :goto_0
    invoke-super {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->encodeAsBytes(Ljava/lang/String;)[B

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    array-length p1, v0

    .line 45
    array-length v2, p0

    .line 46
    add-int/2addr p1, v2

    .line 47
    new-array p1, p1, [B

    .line 48
    .line 49
    array-length v2, v0

    .line 50
    invoke-static {v0, v1, p1, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    array-length v0, v0

    .line 54
    array-length v2, p0

    .line 55
    invoke-static {p0, v1, p1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 56
    .line 57
    .line 58
    return-object p1
.end method

.method public encodeMessage(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setRequestLineDefaults()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/header/RequestLine;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->encodeSIPHeaders(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->isNullRequest()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const-string p0, "\r\n\r\n"

    .line 24
    .line 25
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_1
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->encodeSIPHeaders(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    move-object v0, p1

    .line 18
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 19
    .line 20
    iget-object v2, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 21
    .line 22
    iget-object v0, v0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 23
    .line 24
    invoke-virtual {v2, v0}, Landroid/gov/nist/javax/sip/header/RequestLine;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-super {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :cond_1
    return v1
.end method

.method public getFirstLine()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/RequestLine;->encode()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getInviteTransaction()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->inviteTransaction:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMergeId()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFromTag()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->cSeqHeader:Landroid/gov/nist/javax/sip/header/CSeq;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/SIPHeader;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->callIdHeader:Landroid/gov/nist/javax/sip/header/CallID;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/header/CallID;->getCallId()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getRequestURI()Landroid/javax/sip/address/URI;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p0}, Landroid/javax/sip/address/URI;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    new-instance v3, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p0, ":"

    .line 36
    .line 37
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-static {v3, p0, v2}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_0
    const/4 p0, 0x0

    .line 55
    return-object p0
.end method

.method public getMessageAsEncodedStrings()Ljava/util/LinkedList;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getMessageAsEncodedStrings()Ljava/util/LinkedList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setRequestLineDefaults()V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/RequestLine;->encode()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {v0, p0}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-object v0
.end method

.method public getMessageChannel()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->messageChannel:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMethod()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/RequestLine;->getMethod()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getRequestLine()Landroid/gov/nist/javax/sip/header/RequestLine;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRequestURI()Landroid/javax/sip/address/URI;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/RequestLine;->getUri()Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getSIPVersion()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/RequestLine;->getSipVersion()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getTransaction()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->transactionPointer:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public getViaHost()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getViaHeaders()Landroid/gov/nist/javax/sip/header/ViaList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->getFirst()Landroid/javax/sip/header/Header;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Landroid/gov/nist/javax/sip/header/Via;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/Via;->getHost()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public getViaPort()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getViaHeaders()Landroid/gov/nist/javax/sip/header/ViaList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->getFirst()Landroid/javax/sip/header/Header;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Landroid/gov/nist/javax/sip/header/Via;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/Via;->hasPort()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/Via;->getPort()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :cond_0
    const/16 p0, 0x13c4

    .line 23
    .line 24
    return p0
.end method

.method public match(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    return v2

    .line 21
    :cond_1
    if-ne p1, p0, :cond_2

    .line 22
    .line 23
    return v0

    .line 24
    :cond_2
    move-object v1, p1

    .line 25
    check-cast v1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 26
    .line 27
    iget-object v1, v1, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 28
    .line 29
    iget-object v3, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 30
    .line 31
    if-nez v3, :cond_3

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    return v2

    .line 36
    :cond_3
    if-ne v3, v1, :cond_4

    .line 37
    .line 38
    invoke-super {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->match(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0

    .line 43
    :cond_4
    invoke-virtual {v3, v1}, Landroid/gov/nist/javax/sip/header/SIPObject;->match(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_5

    .line 48
    .line 49
    invoke-super {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->match(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_5

    .line 54
    .line 55
    return v0

    .line 56
    :cond_5
    return v2
.end method

.method public final mustCopyRR(I)Z
    .locals 2

    .line 1
    const/16 v0, 0x64

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-le p1, v0, :cond_0

    .line 5
    .line 6
    const/16 v0, 0x12c

    .line 7
    .line 8
    if-ge p1, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->isDialogCreating(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-nez p0, :cond_0

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_0
    return v1
.end method

.method public setDefaults()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/RequestLine;->getMethod()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/RequestLine;->getUri()Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-nez p0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    const-string v1, "REGISTER"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    const-string v1, "INVITE"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_4

    .line 37
    .line 38
    :cond_3
    instance-of v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;

    .line 39
    .line 40
    if-eqz v0, :cond_4

    .line 41
    .line 42
    check-cast p0, Landroid/gov/nist/javax/sip/address/SipUri;

    .line 43
    .line 44
    const-string v0, "ip"

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/address/SipUri;->setUserParam(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :try_start_0
    const-string v0, "udp"

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/address/SipUri;->setTransportParam(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    :catch_0
    :cond_4
    :goto_0
    return-void
.end method

.method public setInviteTransaction(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->inviteTransaction:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method

.method public setMessageChannel(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->messageChannel:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method

.method public setMethod(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/RequestLine;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 13
    .line 14
    :cond_0
    invoke-static {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getCannonicalName(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/header/RequestLine;->setMethod(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->cSeqHeader:Landroid/gov/nist/javax/sip/header/CSeq;

    .line 24
    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/CSeq;->setMethod(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    :catch_0
    :cond_1
    return-void

    .line 31
    :cond_2
    const-string p0, "null method"

    .line 32
    .line 33
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public setRequestLine(Landroid/gov/nist/javax/sip/header/RequestLine;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 2
    .line 3
    return-void
.end method

.method public setRequestLineDefaults()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/RequestLine;->getMethod()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/gov/nist/javax/sip/header/CSeq;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/CSeq;->getMethod()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getCannonicalName(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/header/RequestLine;->setMethod(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public setRequestURI(Landroid/javax/sip/address/URI;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/RequestLine;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 13
    .line 14
    :cond_0
    check-cast p1, Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/header/RequestLine;->setUri(Landroid/javax/sip/address/URI;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->nullRequest:Z

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    const-string p0, "Null request URI"

    .line 24
    .line 25
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public setSIPVersion(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, "SIP/2.0"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->requestLine:Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/RequestLine;->setSipVersion(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "sipVersion"

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-static {p1, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setTransaction(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;->transactionPointer:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->encode()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
