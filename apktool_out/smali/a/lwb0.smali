.class public abstract La/lwb0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:La/dkz;

.field public static final d:La/dkz;

.field public static final e:La/dkz;

.field public static final f:La/dkz;


# instance fields
.field public final transient a:I

.field public final transient b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/dkz;

    .line 2
    .line 3
    const v1, 0xc350

    .line 4
    .line 5
    .line 6
    const-string v2, "FATAL"

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, La/lwb0;-><init>(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/lwb0;->c:La/dkz;

    .line 12
    .line 13
    new-instance v0, La/dkz;

    .line 14
    .line 15
    const v1, 0x9c40

    .line 16
    .line 17
    .line 18
    const-string v2, "ERROR"

    .line 19
    .line 20
    invoke-direct {v0, v1, v2}, La/lwb0;-><init>(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, La/lwb0;->d:La/dkz;

    .line 24
    .line 25
    new-instance v0, La/dkz;

    .line 26
    .line 27
    const/16 v1, 0x4e20

    .line 28
    .line 29
    const-string v2, "INFO"

    .line 30
    .line 31
    invoke-direct {v0, v1, v2}, La/lwb0;-><init>(ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, La/lwb0;->e:La/dkz;

    .line 35
    .line 36
    new-instance v0, La/dkz;

    .line 37
    .line 38
    const/16 v1, 0x2710

    .line 39
    .line 40
    const-string v2, "DEBUG"

    .line 41
    .line 42
    invoke-direct {v0, v1, v2}, La/lwb0;-><init>(ILjava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sput-object v0, La/lwb0;->f:La/dkz;

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x2710

    .line 5
    .line 6
    iput v0, p0, La/lwb0;->a:I

    .line 7
    .line 8
    const-string v0, "DEBUG"

    .line 9
    .line 10
    iput-object v0, p0, La/lwb0;->b:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput p1, p0, La/lwb0;->a:I

    .line 15
    iput-object p2, p0, La/lwb0;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, La/lwb0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, La/lwb0;

    .line 7
    .line 8
    iget p0, p0, La/lwb0;->a:I

    .line 9
    .line 10
    iget p1, p1, La/lwb0;->a:I

    .line 11
    .line 12
    if-ne p0, p1, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/lwb0;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
