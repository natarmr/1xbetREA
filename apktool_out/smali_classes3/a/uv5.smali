.class public final La/uv5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation

.annotation runtime La/lbk;
.end annotation


# static fields
.field public static final Companion:La/tv5;

.field public static final g:[La/a8z;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:La/bg8;

.field public final c:Ljava/lang/Double;

.field public final d:J

.field public final e:Ljava/lang/String;

.field public final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/tv5;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/uv5;->Companion:La/tv5;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/o85;

    .line 11
    .line 12
    const/16 v2, 0xe

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/o85;-><init>(B)V

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
    aput-object v0, v1, v2

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    const/4 v2, 0x0

    .line 29
    aput-object v2, v1, v0

    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    aput-object v2, v1, v0

    .line 33
    .line 34
    const/4 v0, 0x3

    .line 35
    aput-object v2, v1, v0

    .line 36
    .line 37
    const/4 v0, 0x4

    .line 38
    aput-object v2, v1, v0

    .line 39
    .line 40
    const/4 v0, 0x5

    .line 41
    aput-object v2, v1, v0

    .line 42
    .line 43
    sput-object v1, La/uv5;->g:[La/a8z;

    .line 44
    .line 45
    return-void
.end method

.method public constructor <init>(IIJLa/bg8;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;)V
    .locals 3

    .line 1
    and-int/lit8 v0, p1, 0x38

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x38

    .line 5
    .line 6
    if-ne v2, v0, :cond_3

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    and-int/lit8 v0, p1, 0x1

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object p8, La/iun;->a:La/iun;

    .line 16
    .line 17
    :cond_0
    iput-object p8, p0, La/uv5;->a:Ljava/util/List;

    .line 18
    .line 19
    and-int/lit8 p8, p1, 0x2

    .line 20
    .line 21
    if-nez p8, :cond_1

    .line 22
    .line 23
    iput-object v1, p0, La/uv5;->b:La/bg8;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iput-object p5, p0, La/uv5;->b:La/bg8;

    .line 27
    .line 28
    :goto_0
    and-int/lit8 p1, p1, 0x4

    .line 29
    .line 30
    if-nez p1, :cond_2

    .line 31
    .line 32
    iput-object v1, p0, La/uv5;->c:Ljava/lang/Double;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    iput-object p6, p0, La/uv5;->c:Ljava/lang/Double;

    .line 36
    .line 37
    :goto_1
    iput-wide p3, p0, La/uv5;->d:J

    .line 38
    .line 39
    iput-object p7, p0, La/uv5;->e:Ljava/lang/String;

    .line 40
    .line 41
    iput p2, p0, La/uv5;->f:I

    .line 42
    .line 43
    return-void

    .line 44
    :cond_3
    sget-object p0, La/sv5;->a:La/sv5;

    .line 45
    .line 46
    invoke-virtual {p0}, La/sv5;->getDescriptor()La/ugi0;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p1, v2, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 51
    .line 52
    .line 53
    throw v1
.end method

.method public constructor <init>(JLa/bg8;Ljava/lang/Double;Ljava/lang/String;)V
    .locals 1

    .line 54
    sget-object v0, La/iun;->a:La/iun;

    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object v0, p0, La/uv5;->a:Ljava/util/List;

    .line 58
    iput-object p3, p0, La/uv5;->b:La/bg8;

    .line 59
    iput-object p4, p0, La/uv5;->c:Ljava/lang/Double;

    .line 60
    iput-wide p1, p0, La/uv5;->d:J

    .line 61
    iput-object p5, p0, La/uv5;->e:Ljava/lang/String;

    const/16 p1, 0x16

    .line 62
    iput p1, p0, La/uv5;->f:I

    return-void
.end method
