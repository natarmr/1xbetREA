.class public final synthetic La/m1d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/z6e;

.field public final synthetic c:La/cp;


# direct methods
.method public synthetic constructor <init>(La/z6e;La/cp;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/m1d;->a:B

    iput-object p1, p0, La/m1d;->b:La/z6e;

    iput-object p2, p0, La/m1d;->c:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-byte p1, p0, La/m1d;->a:B

    .line 2
    .line 3
    iget-object v0, p0, La/m1d;->c:La/cp;

    .line 4
    .line 5
    iget-object p0, p0, La/m1d;->b:La/z6e;

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
    check-cast p1, La/xdi0;

    .line 15
    .line 16
    iget-object p1, p1, La/xdi0;->g:La/g0x;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/z6e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, La/rde0;

    .line 27
    .line 28
    iget-object p1, p1, La/rde0;->e:La/g0x;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, La/z6e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_1
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, La/k1d;

    .line 39
    .line 40
    iget-object p1, p1, La/k1d;->a:La/g0x;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/z6e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
