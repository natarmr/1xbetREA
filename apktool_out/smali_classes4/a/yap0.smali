.class public final synthetic La/yap0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gfg;


# direct methods
.method public synthetic constructor <init>(La/gfg;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yap0;->a:B

    iput-object p1, p0, La/yap0;->b:La/gfg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/yap0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/yap0;->b:La/gfg;

    .line 5
    .line 6
    check-cast p1, La/wap0;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p1, La/wap0;->c:La/j0g0;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 19
    .line 20
    instance-of v2, v0, La/g0g0;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    move-object v0, v1

    .line 25
    :cond_0
    move-object v2, v0

    .line 26
    check-cast v2, Ljava/util/List;

    .line 27
    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    iget-object v3, p0, La/gfg;->c:La/ctf0;

    .line 31
    .line 32
    iget-object p0, p0, La/gfg;->h:Ljava/lang/Object;

    .line 33
    .line 34
    move-object v4, p0

    .line 35
    check-cast v4, Ljava/util/Locale;

    .line 36
    .line 37
    iget-object p0, p1, La/wap0;->d:La/sff0;

    .line 38
    .line 39
    iget-object p0, p0, La/sff0;->g:La/mum0;

    .line 40
    .line 41
    iget-object v7, p0, La/mum0;->y:La/v5l0;

    .line 42
    .line 43
    iget-object v5, p1, La/wap0;->b:Ljava/lang/Integer;

    .line 44
    .line 45
    iget-boolean v8, p1, La/wap0;->e:Z

    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_1

    .line 55
    .line 56
    sget-object p0, La/iun;->a:La/iun;

    .line 57
    .line 58
    :goto_0
    move-object v1, p0

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    sget-object v6, La/q0s;->a:La/q0s;

    .line 61
    .line 62
    invoke-static/range {v2 .. v8}, La/ihm0;->h(Ljava/util/List;La/ctf0;Ljava/util/Locale;Ljava/lang/Integer;La/q0s;La/v5l0;Z)La/dap0;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    goto :goto_0

    .line 71
    :cond_2
    :goto_1
    if-nez v1, :cond_3

    .line 72
    .line 73
    sget-object v1, La/iun;->a:La/iun;

    .line 74
    .line 75
    :cond_3
    return-object v1

    .line 76
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    iget-object v0, p1, La/wap0;->c:La/j0g0;

    .line 80
    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 84
    .line 85
    instance-of v2, v0, La/g0g0;

    .line 86
    .line 87
    if-eqz v2, :cond_4

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    move-object v1, v0

    .line 91
    :goto_2
    check-cast v1, Ljava/util/List;

    .line 92
    .line 93
    if-eqz v1, :cond_5

    .line 94
    .line 95
    iget-object p0, p0, La/gfg;->h:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p0, Ljava/util/Locale;

    .line 98
    .line 99
    iget-object p1, p1, La/wap0;->b:Ljava/lang/Integer;

    .line 100
    .line 101
    invoke-static {v1, p0, p1}, La/ihm0;->g(Ljava/util/List;Ljava/util/Locale;Ljava/lang/Integer;)La/r8p0;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    goto :goto_3

    .line 106
    :cond_5
    new-instance p0, La/r8p0;

    .line 107
    .line 108
    new-instance p1, La/bpm;

    .line 109
    .line 110
    sget-object v0, La/vcg0;->a:La/vcg0;

    .line 111
    .line 112
    invoke-direct {p1}, La/bpm;-><init>()V

    .line 113
    .line 114
    .line 115
    const-string v0, "TeamDetailsCalendarUiModelShimmer"

    .line 116
    .line 117
    invoke-direct {p0, v0, p1}, La/r8p0;-><init>(Ljava/lang/String;La/cpm;)V

    .line 118
    .line 119
    .line 120
    :goto_3
    return-object p0

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
