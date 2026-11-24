.class public final synthetic La/y360;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/z77;

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:La/qgv0;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:Z


# direct methods
.method public synthetic constructor <init>(La/z77;ZZLkotlin/jvm/functions/Function1;La/qgv0;Lkotlin/jvm/functions/Function1;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/y360;->a:La/z77;

    iput-boolean p2, p0, La/y360;->b:Z

    iput-boolean p3, p0, La/y360;->c:Z

    iput-object p4, p0, La/y360;->d:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, La/y360;->e:La/qgv0;

    iput-object p6, p0, La/y360;->f:Lkotlin/jvm/functions/Function1;

    iput-boolean p7, p0, La/y360;->g:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    check-cast p1, La/hcz;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/y360;->a:La/z77;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, La/x77;

    .line 10
    .line 11
    iget-object v2, v1, La/x77;->h:La/rv7;

    .line 12
    .line 13
    instance-of v2, v2, La/pv7;

    .line 14
    .line 15
    const/4 v3, 0x3

    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x1

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    new-instance v2, La/h57;

    .line 21
    .line 22
    iget-object v6, p0, La/y360;->d:Lkotlin/jvm/functions/Function1;

    .line 23
    .line 24
    invoke-direct {v2, v0, v6, v5}, La/h57;-><init>(La/z77;Lkotlin/jvm/functions/Function1;B)V

    .line 25
    .line 26
    .line 27
    new-instance v0, La/ugd;

    .line 28
    .line 29
    const v6, -0x565c7bc4

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v6, v5, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1, v4, v4, v0, v3}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 36
    .line 37
    .line 38
    :cond_0
    iget-object v8, v1, La/x77;->g:Ljava/util/ArrayList;

    .line 39
    .line 40
    new-instance v0, La/rj50;

    .line 41
    .line 42
    const/16 v1, 0x16

    .line 43
    .line 44
    invoke-direct {v0, v1}, La/rj50;-><init>(B)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    new-instance v2, La/m160;

    .line 52
    .line 53
    const/4 v6, 0x7

    .line 54
    invoke-direct {v2, v0, v8, v6}, La/m160;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 55
    .line 56
    .line 57
    new-instance v0, La/m160;

    .line 58
    .line 59
    const/16 v6, 0x8

    .line 60
    .line 61
    iget-object v9, p0, La/y360;->e:La/qgv0;

    .line 62
    .line 63
    invoke-direct {v0, v8, v9, v6}, La/m160;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 64
    .line 65
    .line 66
    new-instance v7, La/vfe;

    .line 67
    .line 68
    const/4 v12, 0x3

    .line 69
    iget-object v10, p0, La/y360;->f:Lkotlin/jvm/functions/Function1;

    .line 70
    .line 71
    iget-boolean v11, p0, La/y360;->g:Z

    .line 72
    .line 73
    invoke-direct/range {v7 .. v12}, La/vfe;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;ZB)V

    .line 74
    .line 75
    .line 76
    new-instance v6, La/ugd;

    .line 77
    .line 78
    const v8, 0x799532c4

    .line 79
    .line 80
    .line 81
    invoke-direct {v6, v8, v5, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v1, v2, v0, v6}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 85
    .line 86
    .line 87
    iget-boolean v0, p0, La/y360;->b:Z

    .line 88
    .line 89
    if-eqz v0, :cond_1

    .line 90
    .line 91
    iget-boolean p0, p0, La/y360;->c:Z

    .line 92
    .line 93
    if-nez p0, :cond_1

    .line 94
    .line 95
    sget-object p0, La/mrv;->h:La/ugd;

    .line 96
    .line 97
    invoke-static {p1, v4, v4, p0, v3}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 98
    .line 99
    .line 100
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object p0
.end method
