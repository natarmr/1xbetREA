.class public final synthetic La/qy2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xjk;


# direct methods
.method public synthetic constructor <init>(La/xjk;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qy2;->a:B

    iput-object p1, p0, La/qy2;->b:La/xjk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/qy2;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/qy2;->b:La/xjk;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/eg60;

    .line 9
    .line 10
    iget-object p1, p0, La/xjk;->f:La/fjk;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/xjk;->e:Lkotlin/jvm/functions/Function0;

    .line 16
    .line 17
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/lwk;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    .line 26
    .line 27
    .line 28
    new-instance p1, La/ty2;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-direct {p1, p0, v0}, La/ty2;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
