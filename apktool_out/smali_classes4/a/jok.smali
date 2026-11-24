.class public final synthetic La/jok;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wyg;

.field public final synthetic c:La/cp;


# direct methods
.method public synthetic constructor <init>(La/wyg;La/cp;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/jok;->a:B

    iput-object p1, p0, La/jok;->b:La/wyg;

    iput-object p2, p0, La/jok;->c:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-byte p1, p0, La/jok;->a:B

    .line 2
    .line 3
    iget-object v0, p0, La/jok;->c:La/cp;

    .line 4
    .line 5
    iget-object p0, p0, La/jok;->b:La/wyg;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, La/p6t0;

    .line 15
    .line 16
    invoke-interface {p0, p1}, La/wyg;->e(La/p6t0;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, La/p6t0;

    .line 25
    .line 26
    invoke-interface {p0, p1}, La/wyg;->e(La/p6t0;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, La/p6t0;

    .line 35
    .line 36
    invoke-interface {p0, p1}, La/wyg;->e(La/p6t0;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
