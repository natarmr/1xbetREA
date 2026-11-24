.class public final synthetic La/uxf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ayf0;


# direct methods
.method public synthetic constructor <init>(La/ayf0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/uxf0;->a:B

    iput-object p1, p0, La/uxf0;->b:La/ayf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/uxf0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/uxf0;->b:La/ayf0;

    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    check-cast p2, Landroid/os/Bundle;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/ayf0;->S1:La/eke0;

    .line 14
    .line 15
    const-string v0, "KEY_PICKER_COUNTRY_ID_REQUEST"

    .line 16
    .line 17
    invoke-static {p2, p1, v0}, La/f140;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-virtual {p0}, La/ayf0;->H0()La/nyf0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget-object p2, p0, La/nyf0;->q:La/mne;

    .line 30
    .line 31
    iget-object v5, p2, La/mne;->a:La/rwj;

    .line 32
    .line 33
    new-instance v3, La/cyf0;

    .line 34
    .line 35
    const/4 p2, 0x1

    .line 36
    invoke-direct {v3, p0, p2}, La/cyf0;-><init>(La/nyf0;B)V

    .line 37
    .line 38
    .line 39
    new-instance v6, Le;

    .line 40
    .line 41
    const/16 p2, 0x9

    .line 42
    .line 43
    invoke-direct {v6, p0, p1, v1, p2}, Le;-><init>(Ljava/lang/Object;ILa/yje;B)V

    .line 44
    .line 45
    .line 46
    const/16 v7, 0xa

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 50
    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_0
    sget-object v0, La/ayf0;->S1:La/eke0;

    .line 56
    .line 57
    const-string v0, "KEY_PICKER_MODEL_REQUEST"

    .line 58
    .line 59
    invoke-static {p2, p1, v0}, La/f140;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-virtual {p0}, La/ayf0;->H0()La/nyf0;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    iget-object p2, p0, La/nyf0;->q:La/mne;

    .line 72
    .line 73
    iget-object v5, p2, La/mne;->a:La/rwj;

    .line 74
    .line 75
    sget-object v3, La/lyf0;->a:La/lyf0;

    .line 76
    .line 77
    new-instance v6, La/bh0;

    .line 78
    .line 79
    const/16 p2, 0x17

    .line 80
    .line 81
    invoke-direct {v6, p0, p1, v1, p2}, La/bh0;-><init>(La/diu0;ILa/yje;B)V

    .line 82
    .line 83
    .line 84
    const/16 v7, 0xa

    .line 85
    .line 86
    const/4 v4, 0x0

    .line 87
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 88
    .line 89
    .line 90
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
