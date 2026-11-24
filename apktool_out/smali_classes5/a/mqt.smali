.class public final La/mqt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/lqt;

.field public static final h:[La/a8z;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Ljava/lang/Long;

.field public final d:Ljava/util/List;

.field public final e:J

.field public final f:J

.field public final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/lqt;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/mqt;->Companion:La/lqt;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/tet;

    .line 11
    .line 12
    const/16 v2, 0x11

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/tet;-><init>(B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x7

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
    aput-object v0, v1, v2

    .line 36
    .line 37
    const/4 v0, 0x4

    .line 38
    aput-object v3, v1, v0

    .line 39
    .line 40
    const/4 v0, 0x5

    .line 41
    aput-object v3, v1, v0

    .line 42
    .line 43
    const/4 v0, 0x6

    .line 44
    aput-object v3, v1, v0

    .line 45
    .line 46
    sput-object v1, La/mqt;->h:[La/a8z;

    .line 47
    .line 48
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ILjava/lang/Long;Ljava/util/List;JJI)V
    .locals 2

    .line 1
    and-int/lit8 v0, p1, 0x7f

    .line 2
    .line 3
    const/16 v1, 0x7f

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/mqt;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput p3, p0, La/mqt;->b:I

    .line 13
    .line 14
    iput-object p4, p0, La/mqt;->c:Ljava/lang/Long;

    .line 15
    .line 16
    iput-object p5, p0, La/mqt;->d:Ljava/util/List;

    .line 17
    .line 18
    iput-wide p6, p0, La/mqt;->e:J

    .line 19
    .line 20
    iput-wide p8, p0, La/mqt;->f:J

    .line 21
    .line 22
    iput p10, p0, La/mqt;->g:I

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    sget-object p0, La/kqt;->a:La/kqt;

    .line 26
    .line 27
    invoke-virtual {p0}, La/kqt;->getDescriptor()La/ugi0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p1, v1, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    throw p0
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/Long;Ljava/util/List;JJ)V
    .locals 0

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, La/mqt;->a:Ljava/lang/String;

    .line 38
    iput p2, p0, La/mqt;->b:I

    .line 39
    iput-object p3, p0, La/mqt;->c:Ljava/lang/Long;

    .line 40
    iput-object p4, p0, La/mqt;->d:Ljava/util/List;

    .line 41
    iput-wide p5, p0, La/mqt;->e:J

    .line 42
    iput-wide p7, p0, La/mqt;->f:J

    const/4 p1, 0x2

    .line 43
    iput p1, p0, La/mqt;->g:I

    return-void
.end method
