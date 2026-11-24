.class public final synthetic La/r3f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function2;

.field public final synthetic b:Z

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Ljava/util/Map;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:F

.field public final synthetic g:F


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;ZLjava/util/List;Ljava/util/Map;Lkotlin/jvm/functions/Function1;FF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/r3f0;->a:Lkotlin/jvm/functions/Function2;

    iput-boolean p2, p0, La/r3f0;->b:Z

    iput-object p3, p0, La/r3f0;->c:Ljava/util/List;

    iput-object p4, p0, La/r3f0;->d:Ljava/util/Map;

    iput-object p5, p0, La/r3f0;->e:Lkotlin/jvm/functions/Function1;

    iput p6, p0, La/r3f0;->f:F

    iput p7, p0, La/r3f0;->g:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, La/hcz;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iget-object v1, p0, La/r3f0;->a:Lkotlin/jvm/functions/Function2;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v3, La/tcc;

    .line 13
    .line 14
    const/4 v4, 0x2

    .line 15
    invoke-direct {v3, v1, v4}, La/tcc;-><init>(Lkotlin/jvm/functions/Function2;B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/ugd;

    .line 19
    .line 20
    const v5, 0x5cf38dea

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, v5, v2, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const-string v3, "REGISTRATION_TABS"

    .line 27
    .line 28
    invoke-static {p1, v3, v0, v1, v4}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-boolean v1, p0, La/r3f0;->b:Z

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    sget-object p0, La/epv0;->e:La/ugd;

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    invoke-static {p1, v0, v0, p0, v1}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    new-instance v0, La/k8e0;

    .line 43
    .line 44
    const/16 v1, 0x12

    .line 45
    .line 46
    invoke-direct {v0, v1}, La/k8e0;-><init>(B)V

    .line 47
    .line 48
    .line 49
    iget-object v4, p0, La/r3f0;->c:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    new-instance v10, La/pwe0;

    .line 56
    .line 57
    invoke-direct {v10, v0, v4, v2}, La/pwe0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 58
    .line 59
    .line 60
    new-instance v0, La/d1c0;

    .line 61
    .line 62
    const/16 v3, 0xd

    .line 63
    .line 64
    invoke-direct {v0, v4, v3}, La/d1c0;-><init>(Ljava/util/List;B)V

    .line 65
    .line 66
    .line 67
    new-instance v3, La/s3f0;

    .line 68
    .line 69
    iget-object v6, p0, La/r3f0;->d:Ljava/util/Map;

    .line 70
    .line 71
    iget-object v7, p0, La/r3f0;->e:Lkotlin/jvm/functions/Function1;

    .line 72
    .line 73
    iget v8, p0, La/r3f0;->f:F

    .line 74
    .line 75
    iget v9, p0, La/r3f0;->g:F

    .line 76
    .line 77
    move-object v5, v4

    .line 78
    invoke-direct/range {v3 .. v9}, La/s3f0;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lkotlin/jvm/functions/Function1;FF)V

    .line 79
    .line 80
    .line 81
    new-instance p0, La/ugd;

    .line 82
    .line 83
    const v4, 0x799532c4

    .line 84
    .line 85
    .line 86
    invoke-direct {p0, v4, v2, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v1, v10, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 90
    .line 91
    .line 92
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0
.end method
