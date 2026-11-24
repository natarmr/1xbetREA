.class public final synthetic La/ixq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/sbe;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kxq;


# direct methods
.method public synthetic constructor <init>(La/kxq;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ixq;->a:B

    iput-object p1, p0, La/ixq;->b:La/kxq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/ixq;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ixq;->b:La/kxq;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Landroid/content/Intent;

    .line 9
    .line 10
    iget-object p0, p0, La/kxq;->v:La/cad;

    .line 11
    .line 12
    invoke-virtual {p0}, La/cad;->i()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast p1, Landroid/content/res/Configuration;

    .line 17
    .line 18
    iget-object p0, p0, La/kxq;->v:La/cad;

    .line 19
    .line 20
    invoke-virtual {p0}, La/cad;->i()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
