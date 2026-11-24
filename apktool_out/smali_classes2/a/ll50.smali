.class public final La/ll50;
.super La/kjt;
.source "SourceFile"


# static fields
.field public static final CLIENT_START_TIME_US_FIELD_NUMBER:I = 0x7

.field public static final CUSTOM_ATTRIBUTES_FIELD_NUMBER:I = 0xc

.field private static final DEFAULT_INSTANCE:La/ll50;

.field public static final HTTP_METHOD_FIELD_NUMBER:I = 0x2

.field public static final HTTP_RESPONSE_CODE_FIELD_NUMBER:I = 0x5

.field public static final NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:I = 0xb

.field private static volatile PARSER:La/iq80; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/iq80;"
        }
    .end annotation
.end field

.field public static final PERF_SESSIONS_FIELD_NUMBER:I = 0xd

.field public static final REQUEST_PAYLOAD_BYTES_FIELD_NUMBER:I = 0x3

.field public static final RESPONSE_CONTENT_TYPE_FIELD_NUMBER:I = 0x6

.field public static final RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER:I = 0x4

.field public static final TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER:I = 0x8

.field public static final TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER:I = 0xa

.field public static final TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER:I = 0x9

.field public static final URL_FIELD_NUMBER:I = 0x1


# instance fields
.field private bitField0_:I

.field private clientStartTimeUs_:J

.field private customAttributes_:La/vo20;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/vo20;"
        }
    .end annotation
.end field

.field private httpMethod_:I

.field private httpResponseCode_:I

.field private networkClientErrorReason_:I

.field private perfSessions_:La/amx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/amx;"
        }
    .end annotation
.end field

.field private requestPayloadBytes_:J

.field private responseContentType_:Ljava/lang/String;

.field private responsePayloadBytes_:J

.field private timeToRequestCompletedUs_:J

.field private timeToResponseCompletedUs_:J

.field private timeToResponseInitiatedUs_:J

.field private url_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/ll50;

    .line 2
    .line 3
    invoke-direct {v0}, La/ll50;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/ll50;->DEFAULT_INSTANCE:La/ll50;

    .line 7
    .line 8
    const-class v1, La/ll50;

    .line 9
    .line 10
    invoke-static {v1, v0}, La/kjt;->p(Ljava/lang/Class;La/kjt;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, La/kjt;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/vo20;->b:La/vo20;

    .line 5
    .line 6
    iput-object v0, p0, La/ll50;->customAttributes_:La/vo20;

    .line 7
    .line 8
    const-string v0, ""

    .line 9
    .line 10
    iput-object v0, p0, La/ll50;->url_:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v0, p0, La/ll50;->responseContentType_:Ljava/lang/String;

    .line 13
    .line 14
    sget-object v0, La/e5d0;->d:La/e5d0;

    .line 15
    .line 16
    iput-object v0, p0, La/ll50;->perfSessions_:La/amx;

    .line 17
    .line 18
    return-void
.end method

.method public static M()La/jl50;
    .locals 1

    .line 1
    sget-object v0, La/ll50;->DEFAULT_INSTANCE:La/ll50;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kjt;->i()La/zit;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/jl50;

    .line 8
    .line 9
    return-object v0
.end method

.method public static u()La/ll50;
    .locals 1

    .line 1
    sget-object v0, La/ll50;->DEFAULT_INSTANCE:La/ll50;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final A()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/ll50;->timeToRequestCompletedUs_:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final B()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/ll50;->timeToResponseCompletedUs_:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final C()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/ll50;->timeToResponseInitiatedUs_:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final D()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/ll50;->url_:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final E()Z
    .locals 0

    .line 1
    iget p0, p0, La/ll50;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0x80

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final F()Z
    .locals 0

    .line 1
    iget p0, p0, La/ll50;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x2

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final G()Z
    .locals 0

    .line 1
    iget p0, p0, La/ll50;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x20

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final H()Z
    .locals 0

    .line 1
    iget p0, p0, La/ll50;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x4

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final I()Z
    .locals 0

    .line 1
    iget p0, p0, La/ll50;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x8

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final J()Z
    .locals 0

    .line 1
    iget p0, p0, La/ll50;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0x100

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final K()Z
    .locals 0

    .line 1
    iget p0, p0, La/ll50;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0x400

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final L()Z
    .locals 0

    .line 1
    iget p0, p0, La/ll50;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0x200

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final N(J)V
    .locals 1

    .line 1
    iget v0, p0, La/ll50;->bitField0_:I

    .line 2
    .line 3
    or-int/lit16 v0, v0, 0x80

    .line 4
    .line 5
    iput v0, p0, La/ll50;->bitField0_:I

    .line 6
    .line 7
    iput-wide p1, p0, La/ll50;->clientStartTimeUs_:J

    .line 8
    .line 9
    return-void
.end method

.method public final O(I)V
    .locals 0

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0

    .line 6
    :pswitch_0
    const/16 p1, 0x9

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :pswitch_1
    const/16 p1, 0x8

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :pswitch_2
    const/4 p1, 0x7

    .line 13
    goto :goto_0

    .line 14
    :pswitch_3
    const/4 p1, 0x6

    .line 15
    goto :goto_0

    .line 16
    :pswitch_4
    const/4 p1, 0x5

    .line 17
    goto :goto_0

    .line 18
    :pswitch_5
    const/4 p1, 0x4

    .line 19
    goto :goto_0

    .line 20
    :pswitch_6
    const/4 p1, 0x3

    .line 21
    goto :goto_0

    .line 22
    :pswitch_7
    const/4 p1, 0x2

    .line 23
    goto :goto_0

    .line 24
    :pswitch_8
    const/4 p1, 0x1

    .line 25
    goto :goto_0

    .line 26
    :pswitch_9
    const/4 p1, 0x0

    .line 27
    :goto_0
    iput p1, p0, La/ll50;->httpMethod_:I

    .line 28
    .line 29
    iget p1, p0, La/ll50;->bitField0_:I

    .line 30
    .line 31
    or-int/lit8 p1, p1, 0x2

    .line 32
    .line 33
    iput p1, p0, La/ll50;->bitField0_:I

    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final P(I)V
    .locals 1

    .line 1
    iget v0, p0, La/ll50;->bitField0_:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x20

    .line 4
    .line 5
    iput v0, p0, La/ll50;->bitField0_:I

    .line 6
    .line 7
    iput p1, p0, La/ll50;->httpResponseCode_:I

    .line 8
    .line 9
    return-void
.end method

.method public final Q()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, La/ll50;->networkClientErrorReason_:I

    .line 3
    .line 4
    iget v0, p0, La/ll50;->bitField0_:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x10

    .line 7
    .line 8
    iput v0, p0, La/ll50;->bitField0_:I

    .line 9
    .line 10
    return-void
.end method

.method public final R(J)V
    .locals 1

    .line 1
    iget v0, p0, La/ll50;->bitField0_:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    iput v0, p0, La/ll50;->bitField0_:I

    .line 6
    .line 7
    iput-wide p1, p0, La/ll50;->requestPayloadBytes_:J

    .line 8
    .line 9
    return-void
.end method

.method public final S(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, La/ll50;->bitField0_:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x40

    .line 7
    .line 8
    iput v0, p0, La/ll50;->bitField0_:I

    .line 9
    .line 10
    iput-object p1, p0, La/ll50;->responseContentType_:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public final T(J)V
    .locals 1

    .line 1
    iget v0, p0, La/ll50;->bitField0_:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x8

    .line 4
    .line 5
    iput v0, p0, La/ll50;->bitField0_:I

    .line 6
    .line 7
    iput-wide p1, p0, La/ll50;->responsePayloadBytes_:J

    .line 8
    .line 9
    return-void
.end method

.method public final U(J)V
    .locals 1

    .line 1
    iget v0, p0, La/ll50;->bitField0_:I

    .line 2
    .line 3
    or-int/lit16 v0, v0, 0x100

    .line 4
    .line 5
    iput v0, p0, La/ll50;->bitField0_:I

    .line 6
    .line 7
    iput-wide p1, p0, La/ll50;->timeToRequestCompletedUs_:J

    .line 8
    .line 9
    return-void
.end method

.method public final V(J)V
    .locals 1

    .line 1
    iget v0, p0, La/ll50;->bitField0_:I

    .line 2
    .line 3
    or-int/lit16 v0, v0, 0x400

    .line 4
    .line 5
    iput v0, p0, La/ll50;->bitField0_:I

    .line 6
    .line 7
    iput-wide p1, p0, La/ll50;->timeToResponseCompletedUs_:J

    .line 8
    .line 9
    return-void
.end method

.method public final W(J)V
    .locals 1

    .line 1
    iget v0, p0, La/ll50;->bitField0_:I

    .line 2
    .line 3
    or-int/lit16 v0, v0, 0x200

    .line 4
    .line 5
    iput v0, p0, La/ll50;->bitField0_:I

    .line 6
    .line 7
    iput-wide p1, p0, La/ll50;->timeToResponseInitiatedUs_:J

    .line 8
    .line 9
    return-void
.end method

.method public final X(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget v0, p0, La/ll50;->bitField0_:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, La/ll50;->bitField0_:I

    .line 6
    .line 7
    iput-object p1, p0, La/ll50;->url_:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public final j(I)Ljava/lang/Object;
    .locals 20

    .line 1
    invoke-static/range {p1 .. p1}, La/hne;->E(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-static {}, La/e9d0;->b()V

    .line 10
    .line 11
    .line 12
    return-object v1

    .line 13
    :pswitch_0
    sget-object v0, La/ll50;->PARSER:La/iq80;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-class v1, La/ll50;

    .line 18
    .line 19
    monitor-enter v1

    .line 20
    :try_start_0
    sget-object v0, La/ll50;->PARSER:La/iq80;

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    new-instance v0, La/djt;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    sput-object v0, La/ll50;->PARSER:La/iq80;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    monitor-exit v1

    .line 35
    return-object v0

    .line 36
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    throw v0

    .line 38
    :cond_1
    return-object v0

    .line 39
    :pswitch_1
    sget-object v0, La/ll50;->DEFAULT_INSTANCE:La/ll50;

    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_2
    new-instance v0, La/jl50;

    .line 43
    .line 44
    sget-object v1, La/ll50;->DEFAULT_INSTANCE:La/ll50;

    .line 45
    .line 46
    invoke-direct {v0, v1}, La/zit;-><init>(La/kjt;)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :pswitch_3
    new-instance v0, La/ll50;

    .line 51
    .line 52
    invoke-direct {v0}, La/ll50;-><init>()V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_4
    const-string v2, "bitField0_"

    .line 57
    .line 58
    const-string v3, "url_"

    .line 59
    .line 60
    const-string v4, "httpMethod_"

    .line 61
    .line 62
    sget-object v5, La/rv00;->v:La/rv00;

    .line 63
    .line 64
    const-string v6, "requestPayloadBytes_"

    .line 65
    .line 66
    const-string v7, "responsePayloadBytes_"

    .line 67
    .line 68
    const-string v8, "httpResponseCode_"

    .line 69
    .line 70
    const-string v9, "responseContentType_"

    .line 71
    .line 72
    const-string v10, "clientStartTimeUs_"

    .line 73
    .line 74
    const-string v11, "timeToRequestCompletedUs_"

    .line 75
    .line 76
    const-string v12, "timeToResponseInitiatedUs_"

    .line 77
    .line 78
    const-string v13, "timeToResponseCompletedUs_"

    .line 79
    .line 80
    const-string v14, "networkClientErrorReason_"

    .line 81
    .line 82
    sget-object v15, La/gqw0;->u1:La/gqw0;

    .line 83
    .line 84
    const-string v16, "customAttributes_"

    .line 85
    .line 86
    sget-object v17, La/kl50;->a:La/po20;

    .line 87
    .line 88
    const-string v18, "perfSessions_"

    .line 89
    .line 90
    const-class v19, La/rd90;

    .line 91
    .line 92
    filled-new-array/range {v2 .. v19}, [Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    const-string v1, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001\u1008\u0000\u0002\u180c\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1004\u0005\u0006\u1008\u0006\u0007\u1002\u0007\u0008\u1002\u0008\t\u1002\t\n\u1002\n\u000b\u180c\u0004\u000c2\r\u001b"

    .line 97
    .line 98
    sget-object v2, La/ll50;->DEFAULT_INSTANCE:La/ll50;

    .line 99
    .line 100
    new-instance v3, La/y9e0;

    .line 101
    .line 102
    invoke-direct {v3, v2, v1, v0}, La/y9e0;-><init>(La/y3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    return-object v3

    .line 106
    :pswitch_5
    return-object v1

    .line 107
    :pswitch_6
    const/4 v0, 0x1

    .line 108
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    return-object v0

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/util/List;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/ll50;->perfSessions_:La/amx;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, La/n4;

    .line 5
    .line 6
    iget-boolean v1, v1, La/n4;->a:Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-static {v0}, La/kjt;->o(La/amx;)La/amx;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, La/ll50;->perfSessions_:La/amx;

    .line 15
    .line 16
    :cond_0
    invoke-static {p1, v0}, La/zit;->g(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final s()V
    .locals 1

    .line 1
    iget v0, p0, La/ll50;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x41

    .line 4
    .line 5
    iput v0, p0, La/ll50;->bitField0_:I

    .line 6
    .line 7
    sget-object v0, La/ll50;->DEFAULT_INSTANCE:La/ll50;

    .line 8
    .line 9
    iget-object v0, v0, La/ll50;->responseContentType_:Ljava/lang/String;

    .line 10
    .line 11
    iput-object v0, p0, La/ll50;->responseContentType_:Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public final t()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/ll50;->clientStartTimeUs_:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final v()I
    .locals 1

    .line 1
    iget p0, p0, La/ll50;->httpMethod_:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    goto :goto_0

    .line 9
    :pswitch_0
    const/16 p0, 0xa

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :pswitch_1
    const/16 p0, 0x9

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :pswitch_2
    const/16 p0, 0x8

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :pswitch_3
    const/4 p0, 0x7

    .line 19
    goto :goto_0

    .line 20
    :pswitch_4
    const/4 p0, 0x6

    .line 21
    goto :goto_0

    .line 22
    :pswitch_5
    const/4 p0, 0x5

    .line 23
    goto :goto_0

    .line 24
    :pswitch_6
    const/4 p0, 0x4

    .line 25
    goto :goto_0

    .line 26
    :pswitch_7
    const/4 p0, 0x3

    .line 27
    goto :goto_0

    .line 28
    :pswitch_8
    const/4 p0, 0x2

    .line 29
    goto :goto_0

    .line 30
    :pswitch_9
    move p0, v0

    .line 31
    :goto_0
    if-nez p0, :cond_0

    .line 32
    .line 33
    return v0

    .line 34
    :cond_0
    return p0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final w()I
    .locals 0

    .line 1
    iget p0, p0, La/ll50;->httpResponseCode_:I

    .line 2
    .line 3
    return p0
.end method

.method public final x()La/amx;
    .locals 0

    .line 1
    iget-object p0, p0, La/ll50;->perfSessions_:La/amx;

    .line 2
    .line 3
    return-object p0
.end method

.method public final y()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/ll50;->requestPayloadBytes_:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final z()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/ll50;->responsePayloadBytes_:J

    .line 2
    .line 3
    return-wide v0
.end method
