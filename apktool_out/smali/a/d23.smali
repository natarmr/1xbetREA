.class public final synthetic La/d23;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/h23;

.field public final synthetic c:La/v4q0;


# direct methods
.method public synthetic constructor <init>(La/h23;La/v4q0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/d23;->a:B

    iput-object p1, p0, La/d23;->b:La/h23;

    iput-object p2, p0, La/d23;->c:La/v4q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/d23;->a:B

    .line 2
    .line 3
    const-string v1, "result"

    .line 4
    .line 5
    const/16 v2, 0x18

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, p0, La/d23;->c:La/v4q0;

    .line 9
    .line 10
    iget-object p0, p0, La/d23;->b:La/h23;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/h23;->c:Lkotlin/jvm/functions/Function0;

    .line 16
    .line 17
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    move-object v0, p0

    .line 22
    check-cast v0, La/j6z;

    .line 23
    .line 24
    invoke-interface {v0}, La/j6z;->h()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    move-object v3, p0

    .line 31
    :cond_0
    check-cast v3, La/j6z;

    .line 32
    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    sget-object p0, La/jge0;->e:La/jge0;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-interface {v4, v3}, La/v4q0;->y0(La/j6z;)La/jge0;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const-wide/16 v0, 0x0

    .line 43
    .line 44
    invoke-interface {v3, v0, v1}, La/j6z;->Y(J)J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    invoke-virtual {p0, v0, v1}, La/jge0;->m(J)La/jge0;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    :goto_0
    return-object p0

    .line 53
    :pswitch_0
    iget-object v0, p0, La/h23;->g:La/c23;

    .line 54
    .line 55
    new-instance v5, La/d23;

    .line 56
    .line 57
    const/4 v6, 0x2

    .line 58
    invoke-direct {v5, p0, v4, v6}, La/d23;-><init>(La/h23;La/v4q0;B)V

    .line 59
    .line 60
    .line 61
    new-instance v4, La/mie0;

    .line 62
    .line 63
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    iget-object p0, p0, La/h23;->e:La/pgk0;

    .line 67
    .line 68
    new-instance v6, La/mc;

    .line 69
    .line 70
    invoke-direct {v6, v4, v5, v2}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 71
    .line 72
    .line 73
    const-string v2, "positioner"

    .line 74
    .line 75
    invoke-virtual {p0, v2, v0, v6}, La/pgk0;->d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 76
    .line 77
    .line 78
    iget-object p0, v4, La/mie0;->a:Ljava/lang/Object;

    .line 79
    .line 80
    if-eqz p0, :cond_2

    .line 81
    .line 82
    check-cast p0, La/jge0;

    .line 83
    .line 84
    return-object p0

    .line 85
    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v3

    .line 89
    :pswitch_1
    iget-object v0, p0, La/h23;->f:La/c23;

    .line 90
    .line 91
    new-instance v5, La/a13;

    .line 92
    .line 93
    const/4 v6, 0x3

    .line 94
    invoke-direct {v5, v4, v6}, La/a13;-><init>(Ljava/lang/Object;B)V

    .line 95
    .line 96
    .line 97
    new-instance v4, La/mie0;

    .line 98
    .line 99
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 100
    .line 101
    .line 102
    iget-object p0, p0, La/h23;->e:La/pgk0;

    .line 103
    .line 104
    new-instance v6, La/mc;

    .line 105
    .line 106
    invoke-direct {v6, v4, v5, v2}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 107
    .line 108
    .line 109
    const-string v2, "dataBuilder"

    .line 110
    .line 111
    invoke-virtual {p0, v2, v0, v6}, La/pgk0;->d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 112
    .line 113
    .line 114
    iget-object p0, v4, La/mie0;->a:Ljava/lang/Object;

    .line 115
    .line 116
    if-eqz p0, :cond_3

    .line 117
    .line 118
    check-cast p0, La/u4q0;

    .line 119
    .line 120
    return-object p0

    .line 121
    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v3

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
