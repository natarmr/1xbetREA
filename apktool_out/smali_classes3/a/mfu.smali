.class public final La/mfu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/mii0;

.field public final b:La/k7u;

.field public final c:La/pru;

.field public final d:La/ywu;

.field public final e:La/es;

.field public final f:La/nr;

.field public final g:La/abu;

.field public final h:La/wgu;

.field public final i:La/htt;


# direct methods
.method public constructor <init>(La/mii0;La/k7u;La/pru;La/ywu;La/es;La/nr;La/abu;La/wgu;La/htt;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/mfu;->a:La/mii0;

    .line 11
    .line 12
    iput-object p2, p0, La/mfu;->b:La/k7u;

    .line 13
    .line 14
    iput-object p3, p0, La/mfu;->c:La/pru;

    .line 15
    .line 16
    iput-object p4, p0, La/mfu;->d:La/ywu;

    .line 17
    .line 18
    iput-object p5, p0, La/mfu;->e:La/es;

    .line 19
    .line 20
    iput-object p6, p0, La/mfu;->f:La/nr;

    .line 21
    .line 22
    iput-object p7, p0, La/mfu;->g:La/abu;

    .line 23
    .line 24
    iput-object p8, p0, La/mfu;->h:La/wgu;

    .line 25
    .line 26
    iput-object p9, p0, La/mfu;->i:La/htt;

    .line 27
    .line 28
    return-void
.end method

.method public static a(Ljava/util/List;)I
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v2, v1

    .line 21
    check-cast v2, La/h0w;

    .line 22
    .line 23
    iget-boolean v2, v2, La/h0w;->b:Z

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 32
    .line 33
    const/16 v1, 0xa

    .line 34
    .line 35
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, La/h0w;

    .line 57
    .line 58
    invoke-static {v1}, La/xnm0;->k(La/h0w;)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    const/4 v1, 0x1

    .line 75
    if-ne v0, v1, :cond_3

    .line 76
    .line 77
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    check-cast p0, Ljava/lang/Integer;

    .line 82
    .line 83
    if-eqz p0, :cond_3

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    return p0

    .line 90
    :cond_3
    const/4 p0, 0x0

    .line 91
    return p0
.end method


# virtual methods
.method public final b(La/xa7;)La/lhf0;
    .locals 5

    .line 1
    new-instance v0, La/lhf0;

    .line 2
    .line 3
    new-instance v1, La/gst;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, La/u47;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    iget-object p0, p0, La/mfu;->a:La/mii0;

    .line 13
    .line 14
    invoke-direct {v2, p0, p1, v3, v4}, La/u47;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, La/lhf0;-><init>(La/gm80;Lkotlin/jvm/functions/Function2;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method
