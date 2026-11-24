.class public final Landroid/javax/sip/DialogState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final COMPLETED:Landroid/javax/sip/DialogState;

.field public static final CONFIRMED:Landroid/javax/sip/DialogState;

.field public static final EARLY:Landroid/javax/sip/DialogState;

.field public static final TERMINATED:Landroid/javax/sip/DialogState;

.field public static final _COMPLETED:I = 0x2

.field public static final _CONFIRMED:I = 0x1

.field public static final _EARLY:I = 0x0

.field public static final _TERMINATED:I = 0x3

.field private static m_dialogStateArray:[Landroid/javax/sip/DialogState; = null

.field private static m_size:I = 0x4


# instance fields
.field private m_dialogState:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [Landroid/javax/sip/DialogState;

    .line 3
    .line 4
    sput-object v0, Landroid/javax/sip/DialogState;->m_dialogStateArray:[Landroid/javax/sip/DialogState;

    .line 5
    .line 6
    new-instance v0, Landroid/javax/sip/DialogState;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, v1}, Landroid/javax/sip/DialogState;-><init>(I)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Landroid/javax/sip/DialogState;->EARLY:Landroid/javax/sip/DialogState;

    .line 13
    .line 14
    new-instance v0, Landroid/javax/sip/DialogState;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {v0, v1}, Landroid/javax/sip/DialogState;-><init>(I)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Landroid/javax/sip/DialogState;->CONFIRMED:Landroid/javax/sip/DialogState;

    .line 21
    .line 22
    new-instance v0, Landroid/javax/sip/DialogState;

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    invoke-direct {v0, v1}, Landroid/javax/sip/DialogState;-><init>(I)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Landroid/javax/sip/DialogState;->COMPLETED:Landroid/javax/sip/DialogState;

    .line 29
    .line 30
    new-instance v0, Landroid/javax/sip/DialogState;

    .line 31
    .line 32
    const/4 v1, 0x3

    .line 33
    invoke-direct {v0, v1}, Landroid/javax/sip/DialogState;-><init>(I)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Landroid/javax/sip/DialogState;->TERMINATED:Landroid/javax/sip/DialogState;

    .line 37
    .line 38
    return-void
.end method

.method private constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroid/javax/sip/DialogState;->m_dialogState:I

    .line 5
    .line 6
    sget-object v0, Landroid/javax/sip/DialogState;->m_dialogStateArray:[Landroid/javax/sip/DialogState;

    .line 7
    .line 8
    aput-object p0, v0, p1

    .line 9
    .line 10
    return-void
.end method

.method public static getObject(I)Landroid/javax/sip/DialogState;
    .locals 1

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    sget v0, Landroid/javax/sip/DialogState;->m_size:I

    .line 4
    .line 5
    if-ge p0, v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Landroid/javax/sip/DialogState;->m_dialogStateArray:[Landroid/javax/sip/DialogState;

    .line 8
    .line 9
    aget-object p0, v0, p0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "Invalid dialogState value"

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
    sget-object v0, Landroid/javax/sip/DialogState;->m_dialogStateArray:[Landroid/javax/sip/DialogState;

    .line 2
    .line 3
    iget p0, p0, Landroid/javax/sip/DialogState;->m_dialogState:I

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
    instance-of v1, p1, Landroid/javax/sip/DialogState;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p1, Landroid/javax/sip/DialogState;

    .line 10
    .line 11
    iget p1, p1, Landroid/javax/sip/DialogState;->m_dialogState:I

    .line 12
    .line 13
    iget p0, p0, Landroid/javax/sip/DialogState;->m_dialogState:I

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
    iget p0, p0, Landroid/javax/sip/DialogState;->m_dialogState:I

    .line 2
    .line 3
    return p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/javax/sip/DialogState;->m_dialogState:I

    .line 2
    .line 3
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget p0, p0, Landroid/javax/sip/DialogState;->m_dialogState:I

    .line 2
    .line 3
    if-eqz p0, :cond_3

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-eq p0, v0, :cond_2

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    if-eq p0, v0, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x3

    .line 12
    if-eq p0, v0, :cond_0

    .line 13
    .line 14
    const-string p0, "Error while printing Dialog State"

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    const-string p0, "Terminated Dialog"

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_1
    const-string p0, "Completed Dialog"

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_2
    const-string p0, "Confirmed Dialog"

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_3
    const-string p0, "Early Dialog"

    .line 27
    .line 28
    return-object p0
.end method
