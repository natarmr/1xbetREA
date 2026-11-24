.class public final La/jxf;
.super La/dxn;
.source "SourceFile"


# instance fields
.field public final synthetic e:B


# direct methods
.method public synthetic constructor <init>(La/cxn;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jxf;->e:B

    invoke-direct {p0, p1}, La/dxn;-><init>(La/cxn;)V

    return-void
.end method


# virtual methods
.method public q()V
    .locals 1

    .line 1
    iget-byte v0, p0, La/jxf;->e:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p0, p0, La/dxn;->b:La/cxn;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, La/cxn;->o:Landroid/view/View$OnLongClickListener;

    .line 11
    .line 12
    iget-object p0, p0, La/cxn;->g:Lcom/google/android/material/internal/CheckableImageButton;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v0}, La/cww;->J(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
