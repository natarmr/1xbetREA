.class public final Landroid/javax/sip/TransactionState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final CALLING:Landroid/javax/sip/TransactionState;

.field public static final COMPLETED:Landroid/javax/sip/TransactionState;

.field public static final CONFIRMED:Landroid/javax/sip/TransactionState;

.field public static final PROCEEDING:Landroid/javax/sip/TransactionState;

.field public static final TERMINATED:Landroid/javax/sip/TransactionState;

.field public static final TRYING:Landroid/javax/sip/TransactionState;

.field public static final _CALLING:I = 0x0

.field public static final _COMPLETED:I = 0x3

.field public static final _CONFIRMED:I = 0x4

.field public static final _PROCEEDING:I = 0x2

.field public static final _TERMINATED:I = 0x5

.field public static final _TRYING:I = 0x1

.field private static m_size:I = 0x6

.field private static m_transStateArray:[Landroid/javax/sip/TransactionState;


# instance fields
.field private m_transactionState:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v0, v0, [Landroid/javax/sip/TransactionState;

    .line 3
    .line 4
    sput-object v0, Landroid/javax/sip/TransactionState;->m_transStateArray:[Landroid/javax/sip/TransactionState;

    .line 5
    .line 6
    new-instance v0, Landroid/javax/sip/TransactionState;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, v1}, Landroid/javax/sip/TransactionState;-><init>(I)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Landroid/javax/sip/TransactionState;->CALLING:Landroid/javax/sip/TransactionState;

    .line 13
    .line 14
    new-instance v0, Landroid/javax/sip/TransactionState;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {v0, v1}, Landroid/javax/sip/TransactionState;-><init>(I)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Landroid/javax/sip/TransactionState;->TRYING:Landroid/javax/sip/TransactionState;

    .line 21
    .line 22
    new-instance v0, Landroid/javax/sip/TransactionState;

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    invoke-direct {v0, v1}, Landroid/javax/sip/TransactionState;-><init>(I)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Landroid/javax/sip/TransactionState;->PROCEEDING:Landroid/javax/sip/TransactionState;

    .line 29
    .line 30
    new-instance v0, Landroid/javax/sip/TransactionState;

    .line 31
    .line 32
    const/4 v1, 0x3

    .line 33
    invoke-direct {v0, v1}, Landroid/javax/sip/TransactionState;-><init>(I)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Landroid/javax/sip/TransactionState;->COMPLETED:Landroid/javax/sip/TransactionState;

    .line 37
    .line 38
    new-instance v0, Landroid/javax/sip/TransactionState;

    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    invoke-direct {v0, v1}, Landroid/javax/sip/TransactionState;-><init>(I)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Landroid/javax/sip/TransactionState;->CONFIRMED:Landroid/javax/sip/TransactionState;

    .line 45
    .line 46
    new-instance v0, Landroid/javax/sip/TransactionState;

    .line 47
    .line 48
    const/4 v1, 0x5

    .line 49
    invoke-direct {v0, v1}, Landroid/javax/sip/TransactionState;-><init>(I)V

    .line 50
    .line 51
    .line 52
    sput-object v0, Landroid/javax/sip/TransactionState;->TERMINATED:Landroid/javax/sip/TransactionState;

    .line 53
    .line 54
    return-void
.end method

.method private constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroid/javax/sip/TransactionState;->m_transactionState:I

    .line 5
    .line 6
    sget-object v0, Landroid/javax/sip/TransactionState;->m_transStateArray:[Landroid/javax/sip/TransactionState;

    .line 7
    .line 8
    aput-object p0, v0, p1

    .line 9
    .line 10
    return-void
.end method

.method public static getObject(I)Landroid/javax/sip/TransactionState;
    .locals 1

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    sget v0, Landroid/javax/sip/TransactionState;->m_size:I

    .line 4
    .line 5
    if-ge p0, v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Landroid/javax/sip/TransactionState;->m_transStateArray:[Landroid/javax/sip/TransactionState;

    .line 8
    .line 9
    aget-object p0, v0, p0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "Invalid transactionState value"

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

.method private readResolve()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Landroid/javax/sip/TransactionState;->m_transStateArray:[Landroid/javax/sip/TransactionState;

    .line 2
    .line 3
    iget p0, p0, Landroid/javax/sip/TransactionState;->m_transactionState:I

    .line 4
    .line 5
    aget-object p0, v0, p0

    .line 6
    .line 7
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Landroid/javax/sip/TransactionState;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p1, Landroid/javax/sip/TransactionState;

    .line 10
    .line 11
    iget p1, p1, Landroid/javax/sip/TransactionState;->m_transactionState:I

    .line 12
    .line 13
    iget p0, p0, Landroid/javax/sip/TransactionState;->m_transactionState:I

    .line 14
    .line 15
    if-ne p1, p0, :cond_1

    .line 16
    .line 17
    return v0

    .line 18
    :cond_1
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public getValue()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/javax/sip/TransactionState;->m_transactionState:I

    .line 2
    .line 3
    return p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/javax/sip/TransactionState;->m_transactionState:I

    .line 2
    .line 3
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget p0, p0, Landroid/javax/sip/TransactionState;->m_transactionState:I

    .line 2
    .line 3
    if-eqz p0, :cond_5

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-eq p0, v0, :cond_4

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    if-eq p0, v0, :cond_3

    .line 10
    .line 11
    const/4 v0, 0x3

    .line 12
    if-eq p0, v0, :cond_2

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    if-eq p0, v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x5

    .line 18
    if-eq p0, v0, :cond_0

    .line 19
    .line 20
    const-string p0, "Error while printing Transaction State"

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    const-string p0, "Terminated Transaction"

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    const-string p0, "Confirmed Transaction"

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_2
    const-string p0, "Completed Transaction"

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_3
    const-string p0, "Proceeding Transaction"

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_4
    const-string p0, "Trying Transaction"

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_5
    const-string p0, "Calling Transaction"

    .line 39
    .line 40
    return-object p0
.end method
