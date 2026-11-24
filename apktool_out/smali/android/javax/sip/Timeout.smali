.class public final Landroid/javax/sip/Timeout;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final RETRANSMIT:Landroid/javax/sip/Timeout;

.field public static final TRANSACTION:Landroid/javax/sip/Timeout;

.field public static final _RETRANSMIT:I = 0x0

.field public static final _TRANSACTION:I = 0x1

.field private static m_size:I = 0x2

.field private static m_timeoutArray:[Landroid/javax/sip/Timeout;


# instance fields
.field private m_timeout:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [Landroid/javax/sip/Timeout;

    .line 3
    .line 4
    sput-object v0, Landroid/javax/sip/Timeout;->m_timeoutArray:[Landroid/javax/sip/Timeout;

    .line 5
    .line 6
    new-instance v0, Landroid/javax/sip/Timeout;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, v1}, Landroid/javax/sip/Timeout;-><init>(I)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Landroid/javax/sip/Timeout;->RETRANSMIT:Landroid/javax/sip/Timeout;

    .line 13
    .line 14
    new-instance v0, Landroid/javax/sip/Timeout;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {v0, v1}, Landroid/javax/sip/Timeout;-><init>(I)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Landroid/javax/sip/Timeout;->TRANSACTION:Landroid/javax/sip/Timeout;

    .line 21
    .line 22
    return-void
.end method

.method private constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroid/javax/sip/Timeout;->m_timeout:I

    .line 5
    .line 6
    sget-object v0, Landroid/javax/sip/Timeout;->m_timeoutArray:[Landroid/javax/sip/Timeout;

    .line 7
    .line 8
    aput-object p0, v0, p1

    .line 9
    .line 10
    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Landroid/javax/sip/Timeout;->m_timeoutArray:[Landroid/javax/sip/Timeout;

    .line 2
    .line 3
    iget p0, p0, Landroid/javax/sip/Timeout;->m_timeout:I

    .line 4
    .line 5
    aget-object p0, v0, p0

    .line 6
    .line 7
    return-object p0
.end method


# virtual methods
.method public getObject(I)Landroid/javax/sip/Timeout;
    .locals 0

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    sget p0, Landroid/javax/sip/Timeout;->m_size:I

    .line 4
    .line 5
    if-ge p1, p0, :cond_0

    .line 6
    .line 7
    sget-object p0, Landroid/javax/sip/Timeout;->m_timeoutArray:[Landroid/javax/sip/Timeout;

    .line 8
    .line 9
    aget-object p0, p0, p1

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "Invalid timeout value"

    .line 13
    .line 14
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public getValue()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/javax/sip/Timeout;->m_timeout:I

    .line 2
    .line 3
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget p0, p0, Landroid/javax/sip/Timeout;->m_timeout:I

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-eq p0, v0, :cond_0

    .line 7
    .line 8
    const-string p0, "Error while printing Timeout"

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    const-string p0, "Transaction Timeout"

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_1
    const-string p0, "Retransmission Timeout"

    .line 15
    .line 16
    return-object p0
.end method
