.class public final synthetic La/vwe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/axe;

.field public final synthetic c:J

.field public final synthetic d:I

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(La/axe;JIZB)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/vwe;->a:B

    iput-object p1, p0, La/vwe;->b:La/axe;

    iput-wide p2, p0, La/vwe;->c:J

    iput p4, p0, La/vwe;->d:I

    iput-boolean p5, p0, La/vwe;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/vwe;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/vwe;->b:La/axe;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/axe;->e2:La/kud;

    .line 9
    .line 10
    invoke-virtual {v1}, La/axe;->M0()La/r7f;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    iget-boolean v0, p0, La/vwe;->e:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, v3, La/r7f;->Y0:La/mne;

    .line 23
    .line 24
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 25
    .line 26
    sget-object v10, La/j5f;->a:La/j5f;

    .line 27
    .line 28
    new-instance v2, La/k5f;

    .line 29
    .line 30
    const/4 v8, 0x0

    .line 31
    const/4 v9, 0x0

    .line 32
    iget-wide v4, p0, La/vwe;->c:J

    .line 33
    .line 34
    iget v6, p0, La/vwe;->d:I

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    invoke-direct/range {v2 .. v9}, La/k5f;-><init>(La/r7f;JIZLa/yje;B)V

    .line 38
    .line 39
    .line 40
    const/16 v9, 0xa

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    move-object v4, v0

    .line 44
    move-object v7, v1

    .line 45
    move-object v8, v2

    .line 46
    move-object v5, v10

    .line 47
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 48
    .line 49
    .line 50
    :cond_0
    sget-object p0, La/q4f;->d:La/q4f;

    .line 51
    .line 52
    invoke-virtual {p0}, La/q4f;->a()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    const/4 v0, 0x1

    .line 57
    invoke-virtual {v3, p0, v0}, La/r7f;->q0(IZ)V

    .line 58
    .line 59
    .line 60
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_0
    sget-object v0, La/axe;->e2:La/kud;

    .line 64
    .line 65
    invoke-virtual {v1}, La/axe;->M0()La/r7f;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-object v1, v3, La/r7f;->Y0:La/mne;

    .line 74
    .line 75
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 76
    .line 77
    sget-object v10, La/r6f;->a:La/r6f;

    .line 78
    .line 79
    new-instance v2, La/k5f;

    .line 80
    .line 81
    const/4 v8, 0x0

    .line 82
    const/4 v9, 0x1

    .line 83
    iget-wide v4, p0, La/vwe;->c:J

    .line 84
    .line 85
    iget v6, p0, La/vwe;->d:I

    .line 86
    .line 87
    iget-boolean v7, p0, La/vwe;->e:Z

    .line 88
    .line 89
    invoke-direct/range {v2 .. v9}, La/k5f;-><init>(La/r7f;JIZLa/yje;B)V

    .line 90
    .line 91
    .line 92
    const/16 v9, 0xa

    .line 93
    .line 94
    const/4 v6, 0x0

    .line 95
    move-object v4, v0

    .line 96
    move-object v7, v1

    .line 97
    move-object v8, v2

    .line 98
    move-object v5, v10

    .line 99
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 100
    .line 101
    .line 102
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
