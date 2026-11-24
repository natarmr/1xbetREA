.class public final synthetic La/ww0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/webkit/DownloadListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ww0;->a:B

    iput-object p1, p0, La/ww0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDownloadStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 6

    .line 1
    iget-byte p5, p0, La/ww0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ww0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p5, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    new-instance p2, La/c490;

    .line 11
    .line 12
    const-string p3, ""

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    move-object p1, p3

    .line 17
    :cond_0
    if-nez p4, :cond_1

    .line 18
    .line 19
    move-object p4, p3

    .line 20
    :cond_1
    invoke-direct {p2, p1, p4}, La/c490;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_0
    move-object v3, p0

    .line 28
    check-cast v3, La/o890;

    .line 29
    .line 30
    iget-object p0, v3, La/o890;->X1:La/n0o0;

    .line 31
    .line 32
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    move-object v1, p0

    .line 37
    check-cast v1, La/qog0;

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    new-instance v0, La/q790;

    .line 42
    .line 43
    const/4 v5, 0x1

    .line 44
    move-object v2, p1

    .line 45
    move-object v4, p4

    .line 46
    invoke-direct/range {v0 .. v5}, La/q790;-><init>(La/qog0;Ljava/lang/String;La/yx5;Ljava/lang/String;B)V

    .line 47
    .line 48
    .line 49
    iget-object p0, v1, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 50
    .line 51
    invoke-interface {p0, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, La/qog0;->a()V

    .line 55
    .line 56
    .line 57
    :cond_2
    return-void

    .line 58
    :pswitch_1
    move-object v2, p1

    .line 59
    check-cast p0, La/zw0;

    .line 60
    .line 61
    iget-object p0, p0, La/zw0;->g:La/xdr;

    .line 62
    .line 63
    if-eqz p0, :cond_3

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-interface {p0, v2, p2, p3}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    :cond_3
    return-void

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
