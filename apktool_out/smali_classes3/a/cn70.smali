.class public final synthetic La/cn70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/to70;


# direct methods
.method public synthetic constructor <init>(La/to70;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/cn70;->a:B

    iput-object p1, p0, La/cn70;->b:La/to70;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/cn70;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/cn70;->b:La/to70;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/to70;->f:La/m1e;

    .line 9
    .line 10
    invoke-interface {v0}, La/m1e;->c()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, La/to70;->i:La/oqt;

    .line 17
    .line 18
    invoke-virtual {v0}, La/oqt;->a()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    sget-object v0, La/yy5;->a:La/yy5;

    .line 25
    .line 26
    invoke-virtual {p0, v0}, La/to70;->w(La/zy5;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v0, p0, La/to70;->C:La/hni0;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-virtual {v0, v1}, La/hni0;->a(Z)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, La/to70;->T:La/ly5;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0, v0}, La/to70;->w(La/zy5;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    sget-object v0, La/un70;->a:La/un70;

    .line 44
    .line 45
    invoke-virtual {p0, v0}, La/to70;->F(La/io70;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, La/d5c;->R(La/vne;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    invoke-virtual {p0}, La/to70;->A()V

    .line 62
    .line 63
    .line 64
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
