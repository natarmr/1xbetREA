.class public final La/v1p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/u1p;

.field public static final g:[La/a8z;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:I

.field public final e:J

.field public final f:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/u1p;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/v1p;->Companion:La/u1p;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/ago;

    .line 11
    .line 12
    const/16 v2, 0x1b

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/ago;-><init>(B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x6

    .line 22
    new-array v1, v1, [La/a8z;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    aput-object v3, v1, v2

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    aput-object v3, v1, v2

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    aput-object v3, v1, v2

    .line 33
    .line 34
    const/4 v2, 0x3

    .line 35
    aput-object v3, v1, v2

    .line 36
    .line 37
    const/4 v2, 0x4

    .line 38
    aput-object v3, v1, v2

    .line 39
    .line 40
    const/4 v2, 0x5

    .line 41
    aput-object v0, v1, v2

    .line 42
    .line 43
    sput-object v1, La/v1p;->g:[La/a8z;

    .line 44
    .line 45
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;IIJLjava/util/List;)V
    .locals 2

    .line 1
    and-int/lit8 v0, p1, 0x3f

    .line 2
    .line 3
    const/16 v1, 0x3f

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/v1p;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p3, p0, La/v1p;->b:Ljava/lang/String;

    .line 13
    .line 14
    iput p4, p0, La/v1p;->c:I

    .line 15
    .line 16
    iput p5, p0, La/v1p;->d:I

    .line 17
    .line 18
    iput-wide p6, p0, La/v1p;->e:J

    .line 19
    .line 20
    iput-object p8, p0, La/v1p;->f:Ljava/util/List;

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    sget-object p0, La/t1p;->a:La/t1p;

    .line 24
    .line 25
    invoke-virtual {p0}, La/t1p;->getDescriptor()La/ugi0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p1, v1, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    throw p0
.end method

.method public constructor <init>(Ljava/lang/String;IIJLjava/util/ArrayList;)V
    .locals 1

    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, La/v1p;->a:Ljava/lang/String;

    .line 36
    iput-object v0, p0, La/v1p;->b:Ljava/lang/String;

    .line 37
    iput p2, p0, La/v1p;->c:I

    .line 38
    iput p3, p0, La/v1p;->d:I

    .line 39
    iput-wide p4, p0, La/v1p;->e:J

    .line 40
    iput-object p6, p0, La/v1p;->f:Ljava/util/List;

    return-void
.end method
