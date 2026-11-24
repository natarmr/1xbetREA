.class public final synthetic La/q51;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/v51;


# direct methods
.method public synthetic constructor <init>(La/v51;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/q51;->a:B

    iput-object p1, p0, La/q51;->b:La/v51;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/q51;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/q51;->b:La/v51;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p1, La/v51;->a2:La/qek0;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, La/v51;->H0()La/b61;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, La/b61;->y()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    sget-object v0, La/v51;->a2:La/qek0;

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 27
    .line 28
    const/16 v0, 0x21

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    if-lt p2, v0, :cond_0

    .line 32
    .line 33
    invoke-static {p1}, La/c7;->h(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-string p2, "DAILY_TASKS_SWITCH_TAB"

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    instance-of p2, p1, La/lr1;

    .line 45
    .line 46
    if-nez p2, :cond_1

    .line 47
    .line 48
    move-object p1, v1

    .line 49
    :cond_1
    check-cast p1, La/lr1;

    .line 50
    .line 51
    :goto_0
    check-cast p1, La/lr1;

    .line 52
    .line 53
    if-nez p1, :cond_2

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    invoke-virtual {p0}, La/v51;->H0()La/b61;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Landroidx/fragment/app/e;->P()I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    const/4 v0, 0x1

    .line 69
    if-le p0, v0, :cond_3

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    const/4 v0, 0x0

    .line 73
    :goto_1
    const/4 p0, 0x4

    .line 74
    invoke-static {p2, p1, v0, v1, p0}, La/b61;->x(La/b61;La/lr1;ZLorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;I)V

    .line 75
    .line 76
    .line 77
    :goto_2
    return-void

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
