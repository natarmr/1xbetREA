.class public final La/d8s0;
.super La/w5;
.source "SourceFile"


# instance fields
.field public final u:La/cck;

.field public final v:Landroid/content/res/ColorStateList;


# direct methods
.method public constructor <init>(La/cck;)V
    .locals 1

    .line 1
    iget-object v0, p1, La/cck;->b:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {p0, v0}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/d8s0;->u:La/cck;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, La/d8s0;->v:Landroid/content/res/ColorStateList;

    .line 13
    .line 14
    return-void
.end method
