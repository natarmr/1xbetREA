.class public final synthetic La/sfd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zkz;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/sfd;->a:B

    iput-object p1, p0, La/sfd;->b:Ljava/lang/Object;

    iput-object p2, p0, La/sfd;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final l(La/clz;La/kkz;)V
    .locals 1

    .line 1
    iget-byte p1, p0, La/sfd;->a:B

    .line 2
    .line 3
    iget-object v0, p0, La/sfd;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, La/sfd;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, La/kkz;

    .line 11
    .line 12
    check-cast v0, La/pz40;

    .line 13
    .line 14
    if-ne p2, p0, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Lkotlin/jvm/functions/Function0;

    .line 21
    .line 22
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :pswitch_0
    check-cast p0, La/jg60;

    .line 27
    .line 28
    check-cast v0, La/agd;

    .line 29
    .line 30
    sget-object p1, La/kkz;->ON_CREATE:La/kkz;

    .line 31
    .line 32
    if-ne p2, p1, :cond_1

    .line 33
    .line 34
    invoke-static {v0}, La/uq6;->h(La/agd;)Landroid/window/OnBackInvokedDispatcher;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1}, La/jg60;->d(Landroid/window/OnBackInvokedDispatcher;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
