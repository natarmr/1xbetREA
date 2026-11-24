.class public final synthetic La/bf50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:La/yjd;

.field public final synthetic b:Z

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:Z

.field public final synthetic f:Lkotlin/jvm/functions/Function0;

.field public final synthetic g:Lkotlin/jvm/functions/Function0;

.field public final synthetic h:La/gf50;


# direct methods
.method public synthetic constructor <init>(La/yjd;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/gf50;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/bf50;->a:La/yjd;

    iput-boolean p2, p0, La/bf50;->b:Z

    iput-object p3, p0, La/bf50;->c:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, La/bf50;->d:Lkotlin/jvm/functions/Function0;

    iput-boolean p5, p0, La/bf50;->e:Z

    iput-object p6, p0, La/bf50;->f:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, La/bf50;->g:Lkotlin/jvm/functions/Function0;

    iput-object p8, p0, La/bf50;->h:La/gf50;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, La/bf50;->a:La/yjd;

    .line 2
    .line 3
    iget-boolean v1, v0, La/af50;->f:Z

    .line 4
    .line 5
    iget-boolean v2, p0, La/bf50;->b:Z

    .line 6
    .line 7
    if-ne v1, v2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iput-boolean v2, v0, La/af50;->f:Z

    .line 11
    .line 12
    iget-object v1, v0, La/af50;->g:La/ye50;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-object v1, v1, La/ye50;->e:La/ff50;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1}, La/ff50;->b()V

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    iget-object v1, p0, La/bf50;->c:Lkotlin/jvm/functions/Function0;

    .line 24
    .line 25
    iput-object v1, v0, La/yjd;->i:Lkotlin/jvm/functions/Function0;

    .line 26
    .line 27
    iget-object v1, p0, La/bf50;->d:Lkotlin/jvm/functions/Function0;

    .line 28
    .line 29
    iput-object v1, v0, La/yjd;->j:Lkotlin/jvm/functions/Function0;

    .line 30
    .line 31
    iget-boolean v1, p0, La/bf50;->e:Z

    .line 32
    .line 33
    invoke-virtual {v0, v1}, La/af50;->i(Z)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, La/bf50;->f:Lkotlin/jvm/functions/Function0;

    .line 37
    .line 38
    iput-object v1, v0, La/yjd;->k:Lkotlin/jvm/functions/Function0;

    .line 39
    .line 40
    iget-object v1, p0, La/bf50;->g:Lkotlin/jvm/functions/Function0;

    .line 41
    .line 42
    iput-object v1, v0, La/yjd;->l:Lkotlin/jvm/functions/Function0;

    .line 43
    .line 44
    iget-object p0, p0, La/bf50;->h:La/gf50;

    .line 45
    .line 46
    iget-object v1, p0, La/gf50;->c:La/pz40;

    .line 47
    .line 48
    check-cast v1, La/hgk0;

    .line 49
    .line 50
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, La/df50;

    .line 55
    .line 56
    iget-object v2, p0, La/gf50;->b:La/pz40;

    .line 57
    .line 58
    check-cast v2, La/hgk0;

    .line 59
    .line 60
    invoke-virtual {v2}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Ljava/util/List;

    .line 65
    .line 66
    iget-object p0, p0, La/gf50;->d:La/pz40;

    .line 67
    .line 68
    check-cast p0, La/hgk0;

    .line 69
    .line 70
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Ljava/util/List;

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    iput-object v1, v0, La/af50;->a:La/df50;

    .line 86
    .line 87
    iput-object v2, v0, La/af50;->b:Ljava/util/List;

    .line 88
    .line 89
    iput-object p0, v0, La/af50;->c:Ljava/util/List;

    .line 90
    .line 91
    iget-object p0, v0, La/af50;->g:La/ye50;

    .line 92
    .line 93
    if-eqz p0, :cond_2

    .line 94
    .line 95
    iget-object p0, p0, La/ye50;->e:La/ff50;

    .line 96
    .line 97
    if-eqz p0, :cond_2

    .line 98
    .line 99
    invoke-virtual {p0, v0}, La/ff50;->d(La/af50;)V

    .line 100
    .line 101
    .line 102
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object p0
.end method
