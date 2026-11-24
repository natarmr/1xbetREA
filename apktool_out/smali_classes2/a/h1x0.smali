.class public final synthetic La/h1x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/lin0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/h1x0;->a:B

    iput-object p1, p0, La/h1x0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/h1x0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/h1x0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/i8x0;

    .line 9
    .line 10
    iget-object v0, p0, La/i8x0;->c:La/lin0;

    .line 11
    .line 12
    invoke-interface {v0}, La/lin0;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, La/fr40;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, La/i8x0;->b:La/lin0;

    .line 22
    .line 23
    invoke-interface {v1}, La/lin0;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, La/y2x0;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v1, v1, La/y2x0;->a:La/tzw0;

    .line 33
    .line 34
    invoke-static {}, La/s9w0;->a()La/euo0;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    new-instance v3, La/w4p0;

    .line 39
    .line 40
    const/16 v4, 0x19

    .line 41
    .line 42
    invoke-direct {v3, v1, v4}, La/w4p0;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    iput-object v3, v2, La/euo0;->a:La/mff0;

    .line 46
    .line 47
    sget-object v3, La/f1t0;->k:Lcom/google/android/gms/common/Feature;

    .line 48
    .line 49
    filled-new-array {v3}, [Lcom/google/android/gms/common/Feature;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    iput-object v3, v2, La/euo0;->d:[Lcom/google/android/gms/common/Feature;

    .line 54
    .line 55
    const/4 v3, 0x1

    .line 56
    iput-boolean v3, v2, La/euo0;->c:Z

    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    iput-boolean v4, v2, La/euo0;->b:Z

    .line 60
    .line 61
    invoke-virtual {v2}, La/euo0;->a()La/s9w0;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v1, v4, v2}, La/nav;->b(ILa/s9w0;)Lcom/google/android/gms/tasks/Task;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {v1}, La/y2x0;->b(Lcom/google/android/gms/tasks/Task;)La/d1;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    sget-object v2, La/wgw0;->e:La/wgw0;

    .line 74
    .line 75
    new-instance v4, La/e1;

    .line 76
    .line 77
    const-class v5, La/s2x0;

    .line 78
    .line 79
    invoke-direct {v4, v1, v5, v2}, La/f1;-><init>(La/ig00;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v4}, La/n2x;->I(Ljava/util/concurrent/Executor;La/epq;)Ljava/util/concurrent/Executor;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-interface {v1, v4, v2}, La/ig00;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 87
    .line 88
    .line 89
    new-instance v1, La/a6x0;

    .line 90
    .line 91
    invoke-direct {v1, p0, v3}, La/a6x0;-><init>(Ljava/lang/Object;B)V

    .line 92
    .line 93
    .line 94
    sget p0, La/n5;->k:I

    .line 95
    .line 96
    new-instance p0, La/m5;

    .line 97
    .line 98
    invoke-direct {p0, v4, v1}, La/n5;-><init>(La/ig00;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v0, p0}, La/n2x;->I(Ljava/util/concurrent/Executor;La/epq;)Ljava/util/concurrent/Executor;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-interface {v4, p0, v1}, La/ig00;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 106
    .line 107
    .line 108
    new-instance v1, La/fju0;

    .line 109
    .line 110
    const/16 v2, 0xf

    .line 111
    .line 112
    invoke-direct {v1, p0, v2}, La/fju0;-><init>(Ljava/lang/Object;B)V

    .line 113
    .line 114
    .line 115
    invoke-interface {p0, v1, v0}, La/ig00;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 116
    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_0
    sget-object v0, La/c1x0;->j:Ljava/lang/Object;

    .line 120
    .line 121
    new-instance v0, La/x8x0;

    .line 122
    .line 123
    check-cast p0, Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-direct {v0, p0}, La/x8x0;-><init>(Ljava/util/ArrayList;)V

    .line 126
    .line 127
    .line 128
    return-object v0

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
