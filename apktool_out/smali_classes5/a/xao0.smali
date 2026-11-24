.class public final synthetic La/xao0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/ujd;

.field public final synthetic b:La/yx5;

.field public final synthetic c:La/oll0;

.field public final synthetic d:La/dcv0;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:La/xdr;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;

.field public final synthetic h:La/i3t0;


# direct methods
.method public synthetic constructor <init>(La/ujd;La/yx5;La/oll0;La/dcv0;Lkotlin/jvm/functions/Function0;La/xdr;Lkotlin/jvm/functions/Function1;La/i3t0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/xao0;->a:La/ujd;

    iput-object p2, p0, La/xao0;->b:La/yx5;

    iput-object p3, p0, La/xao0;->c:La/oll0;

    iput-object p4, p0, La/xao0;->d:La/dcv0;

    iput-object p5, p0, La/xao0;->e:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, La/xao0;->f:La/xdr;

    iput-object p7, p0, La/xao0;->g:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, La/xao0;->h:La/i3t0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, La/zuk0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, La/wuk0;

    .line 7
    .line 8
    iget-object v1, p0, La/xao0;->b:La/yx5;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p1, La/wuk0;

    .line 13
    .line 14
    iget-object p1, p1, La/wuk0;->a:La/sjd;

    .line 15
    .line 16
    iget-object v0, p0, La/xao0;->a:La/ujd;

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    instance-of v0, p1, La/xuk0;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    check-cast p1, La/xuk0;

    .line 27
    .line 28
    iget-object p1, p1, La/xuk0;->a:La/nll0;

    .line 29
    .line 30
    iget-object v0, p0, La/xao0;->c:La/oll0;

    .line 31
    .line 32
    invoke-virtual {v0, v1, p1}, La/oll0;->a(Landroidx/fragment/app/Fragment;La/nll0;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    instance-of v0, p1, La/yuk0;

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    check-cast p1, La/yuk0;

    .line 41
    .line 42
    iget-object p1, p1, La/yuk0;->a:La/ubv0;

    .line 43
    .line 44
    iget-object v0, p0, La/xao0;->d:La/dcv0;

    .line 45
    .line 46
    invoke-virtual {v0, v1, p1}, La/dcv0;->a(Landroidx/fragment/app/Fragment;La/ubv0;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    sget-object v0, La/tuk0;->a:La/tuk0;

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    iget-object p1, p0, La/xao0;->e:Lkotlin/jvm/functions/Function0;

    .line 59
    .line 60
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    instance-of v0, p1, La/uuk0;

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    check-cast p1, La/uuk0;

    .line 69
    .line 70
    iget-object p1, p1, La/uuk0;->a:La/lik0;

    .line 71
    .line 72
    iget-object v0, p1, La/lik0;->a:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v1, p1, La/lik0;->d:Ljava/lang/String;

    .line 75
    .line 76
    iget-object p1, p1, La/lik0;->c:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v2, p0, La/xao0;->f:La/xdr;

    .line 79
    .line 80
    invoke-interface {v2, v0, v1, p1}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_4
    sget-object v0, La/vuk0;->a:La/vuk0;

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_5

    .line 91
    .line 92
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 93
    .line 94
    iget-object v0, p0, La/xao0;->g:Lkotlin/jvm/functions/Function1;

    .line 95
    .line 96
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    :goto_0
    sget-object p1, La/iqk0;->a:La/iqk0;

    .line 100
    .line 101
    iget-object p0, p0, La/xao0;->h:La/i3t0;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 110
    .line 111
    .line 112
    const/4 p0, 0x0

    .line 113
    return-object p0
.end method
