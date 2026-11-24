.class public final synthetic La/qij;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rij;


# direct methods
.method public synthetic constructor <init>(La/rij;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qij;->a:B

    iput-object p1, p0, La/qij;->b:La/rij;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-byte p1, p0, La/qij;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/qij;->b:La/rij;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/rij;->v:La/g6v0;

    .line 9
    .line 10
    invoke-virtual {p0}, La/g6v0;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object p0, p0, La/rij;->u:La/avs0;

    .line 15
    .line 16
    invoke-virtual {p0}, La/avs0;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
