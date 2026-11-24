.class public final synthetic La/c5b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/g5b;


# direct methods
.method public synthetic constructor <init>(La/g5b;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/c5b;->a:B

    iput-object p1, p0, La/c5b;->b:La/g5b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/c5b;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/c5b;->b:La/g5b;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p1, La/g5b;->c2:La/gl5;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, La/g5b;->Q0()La/k3t0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, La/q4b;->a:La/q4b;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    sget-object v0, La/g5b;->c2:La/gl5;

    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    const/16 v0, 0x21

    .line 31
    .line 32
    if-lt p2, v0, :cond_0

    .line 33
    .line 34
    invoke-static {p1}, La/uq6;->l(Landroid/os/Bundle;)Ljava/util/ArrayList;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const-string p2, "REMOVE_ALL_SPORT_EVENTS_RESULT"

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :goto_0
    if-nez p1, :cond_1

    .line 46
    .line 47
    sget-object p1, La/iun;->a:La/iun;

    .line 48
    .line 49
    :cond_1
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-nez p2, :cond_2

    .line 54
    .line 55
    invoke-virtual {p0}, La/g5b;->T0()La/k3t0;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    new-instance p2, La/yf2;

    .line 60
    .line 61
    invoke-direct {p2, p1}, La/yf2;-><init>(Ljava/util/List;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    return-void

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
