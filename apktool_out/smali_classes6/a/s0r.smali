.class public final La/s0r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/nae0;


# instance fields
.field public final synthetic a:B

.field public final b:Landroidx/fragment/app/Fragment;

.field public final c:Lkotlin/jvm/functions/Function1;

.field public d:La/yfu0;

.field public final e:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/s0r;->a:B

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/s0r;->b:Landroidx/fragment/app/Fragment;

    .line 16
    .line 17
    iput-object p2, p0, La/s0r;->c:Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    new-instance p1, Landroid/os/Handler;

    .line 20
    .line 21
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, La/s0r;->e:Landroid/os/Handler;

    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, La/s0r;->b:Landroidx/fragment/app/Fragment;

    .line 41
    .line 42
    iput-object p2, p0, La/s0r;->c:Lkotlin/jvm/functions/Function1;

    .line 43
    .line 44
    new-instance p1, Landroid/os/Handler;

    .line 45
    .line 46
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, La/s0r;->e:Landroid/os/Handler;

    .line 54
    .line 55
    return-void

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/s0r;->a:B

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    iget-object v2, p0, La/s0r;->b:Landroidx/fragment/app/Fragment;

    .line 6
    .line 7
    iget-object v3, p0, La/s0r;->c:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p2, Landroidx/fragment/app/Fragment;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, La/s0r;->d:La/yfu0;

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-interface {p1}, La/yfu0;->getRoot()Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->J()Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object p1, v4

    .line 41
    :goto_0
    if-eqz p1, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-interface {v3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, La/yfu0;

    .line 53
    .line 54
    iput-object p1, p0, La/s0r;->d:La/yfu0;

    .line 55
    .line 56
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p2}, La/n6r;->b()V

    .line 61
    .line 62
    .line 63
    iget-object p2, p2, La/n6r;->c:La/glz;

    .line 64
    .line 65
    new-instance v0, La/tvj;

    .line 66
    .line 67
    new-instance v2, La/gup;

    .line 68
    .line 69
    const/16 v3, 0xb

    .line 70
    .line 71
    invoke-direct {v2, p2, p0, v3}, La/gup;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 72
    .line 73
    .line 74
    invoke-direct {v0, v4, v4, v2, v1}, La/tvj;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2, v0}, La/glz;->a(La/blz;)V

    .line 78
    .line 79
    .line 80
    :goto_1
    return-object p1

    .line 81
    :pswitch_0
    check-cast p2, Landroidx/fragment/app/Fragment;

    .line 82
    .line 83
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, La/s0r;->d:La/yfu0;

    .line 90
    .line 91
    if-eqz p1, :cond_2

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_2
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-interface {v3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    check-cast p1, La/yfu0;

    .line 110
    .line 111
    iput-object p1, p0, La/s0r;->d:La/yfu0;

    .line 112
    .line 113
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-virtual {p2}, La/n6r;->b()V

    .line 118
    .line 119
    .line 120
    iget-object p2, p2, La/n6r;->c:La/glz;

    .line 121
    .line 122
    new-instance v0, La/tvj;

    .line 123
    .line 124
    new-instance v2, La/gup;

    .line 125
    .line 126
    const/16 v3, 0xa

    .line 127
    .line 128
    invoke-direct {v2, p2, p0, v3}, La/gup;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 129
    .line 130
    .line 131
    invoke-direct {v0, v4, v4, v2, v1}, La/tvj;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;I)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, v0}, La/glz;->a(La/blz;)V

    .line 135
    .line 136
    .line 137
    :goto_2
    return-object p1

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
