.class public final synthetic La/qhv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cp;

.field public final synthetic c:La/vft;


# direct methods
.method public synthetic constructor <init>(BLa/cp;La/vft;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/qhv;->a:B

    iput-object p2, p0, La/qhv;->b:La/cp;

    iput-object p3, p0, La/qhv;->c:La/vft;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-byte p1, p0, La/qhv;->a:B

    .line 2
    .line 3
    iget-object v0, p0, La/qhv;->c:La/vft;

    .line 4
    .line 5
    iget-object p0, p0, La/qhv;->b:La/cp;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 11
    .line 12
    check-cast p1, La/ohv;

    .line 13
    .line 14
    iget-object p1, p1, La/ohv;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightListCheckBox;

    .line 15
    .line 16
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, La/phv;

    .line 21
    .line 22
    iget-boolean v1, v1, La/phv;->c:Z

    .line 23
    .line 24
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightListCheckBox;->setSelected(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/phv;

    .line 32
    .line 33
    iget p0, p0, La/phv;->a:I

    .line 34
    .line 35
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v0, p0}, La/vft;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_0
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 44
    .line 45
    check-cast p1, La/ohv;

    .line 46
    .line 47
    iget-object p1, p1, La/ohv;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightListCheckBox;

    .line 48
    .line 49
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, La/phv;

    .line 54
    .line 55
    iget-boolean v1, v1, La/phv;->c:Z

    .line 56
    .line 57
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightListCheckBox;->setSelected(Z)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, La/phv;

    .line 65
    .line 66
    iget p0, p0, La/phv;->a:I

    .line 67
    .line 68
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {v0, p0}, La/vft;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
