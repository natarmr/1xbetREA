.class public final La/fro;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/ero;

.field public static final f:[La/a8z;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:I

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ero;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/fro;->Companion:La/ero;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/ago;

    .line 11
    .line 12
    const/16 v2, 0x14

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
    move-result-object v1

    .line 21
    new-instance v2, La/ago;

    .line 22
    .line 23
    const/16 v3, 0x15

    .line 24
    .line 25
    invoke-direct {v2, v3}, La/ago;-><init>(B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v2, 0x5

    .line 33
    new-array v2, v2, [La/a8z;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    aput-object v4, v2, v3

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    aput-object v4, v2, v3

    .line 41
    .line 42
    const/4 v3, 0x2

    .line 43
    aput-object v4, v2, v3

    .line 44
    .line 45
    const/4 v3, 0x3

    .line 46
    aput-object v1, v2, v3

    .line 47
    .line 48
    const/4 v1, 0x4

    .line 49
    aput-object v0, v2, v1

    .line 50
    .line 51
    sput-object v2, La/fro;->f:[La/a8z;

    .line 52
    .line 53
    return-void
.end method

.method public synthetic constructor <init>(IJJILjava/util/List;Ljava/util/List;)V
    .locals 2

    .line 1
    and-int/lit8 v0, p1, 0x1f

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-wide p2, p0, La/fro;->a:J

    .line 11
    .line 12
    iput-wide p4, p0, La/fro;->b:J

    .line 13
    .line 14
    iput p6, p0, La/fro;->c:I

    .line 15
    .line 16
    iput-object p7, p0, La/fro;->d:Ljava/util/List;

    .line 17
    .line 18
    iput-object p8, p0, La/fro;->e:Ljava/util/List;

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    sget-object p0, La/dro;->a:La/dro;

    .line 22
    .line 23
    invoke-virtual {p0}, La/dro;->getDescriptor()La/ugi0;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p1, v1, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    throw p0
.end method

.method public constructor <init>(JJILjava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-wide p1, p0, La/fro;->a:J

    .line 34
    iput-wide p3, p0, La/fro;->b:J

    .line 35
    iput p5, p0, La/fro;->c:I

    .line 36
    iput-object p6, p0, La/fro;->d:Ljava/util/List;

    .line 37
    iput-object p7, p0, La/fro;->e:Ljava/util/List;

    return-void
.end method
