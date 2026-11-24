.class public final synthetic La/fym0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:La/l5r;

.field public final synthetic b:I

.field public final synthetic c:La/j1l0;

.field public final synthetic d:La/swm0;


# direct methods
.method public synthetic constructor <init>(La/l5r;ILa/j1l0;La/swm0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fym0;->a:La/l5r;

    iput p2, p0, La/fym0;->b:I

    iput-object p3, p0, La/fym0;->c:La/j1l0;

    iput-object p4, p0, La/fym0;->d:La/swm0;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, La/fym0;->a:La/l5r;

    .line 2
    .line 3
    iget-object p1, p1, La/l5r;->c:La/uk5;

    .line 4
    .line 5
    iget-object p1, p1, La/uk5;->e:Landroid/view/View;

    .line 6
    .line 7
    check-cast p1, Lorg/xplatform/ui_core/viewcomponents/tabs/TabLayoutChips;

    .line 8
    .line 9
    invoke-virtual {p1}, Lorg/xplatform/ui_core/viewcomponents/tabs/TabLayoutChips;->getSelectedTabPosition()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iget v0, p0, La/fym0;->b:I

    .line 14
    .line 15
    if-eq p1, v0, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, La/fym0;->c:La/j1l0;

    .line 18
    .line 19
    iget-object p0, p0, La/fym0;->d:La/swm0;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, La/j1l0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method
