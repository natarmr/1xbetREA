.class public final synthetic La/o620;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/c720;


# direct methods
.method public synthetic constructor <init>(La/c720;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/o620;->a:B

    iput-object p1, p0, La/o620;->b:La/c720;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-byte p1, p0, La/o620;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/o620;->b:La/c720;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p1, La/c720;->p2:La/wsz;

    .line 9
    .line 10
    new-instance p1, La/n620;

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    invoke-direct {p1, p0, v0}, La/n620;-><init>(La/c720;B)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, La/dyb;->Q(Lkotlin/jvm/functions/Function0;)Z

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    sget-object p1, La/c720;->p2:La/wsz;

    .line 21
    .line 22
    new-instance p1, La/n620;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p1, p0, v0}, La/n620;-><init>(La/c720;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, La/dyb;->Q(Lkotlin/jvm/functions/Function0;)Z

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
