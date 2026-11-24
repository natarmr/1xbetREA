.class public final La/jg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/yfu0;


# instance fields
.field public final synthetic a:B

.field public final b:Landroid/widget/TextView;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final e:Landroid/view/View;

.field public final f:Landroid/view/View;

.field public final g:Landroid/view/View;

.field public final h:Landroid/view/View;

.field public final i:Landroid/view/View;

.field public final j:Landroid/view/View;

.field public final k:Landroid/view/View;

.field public final l:Landroid/view/View;

.field public final m:Landroid/view/View;


# direct methods
.method public constructor <init>(Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;Landroid/widget/TextView;Landroidx/constraintlayout/helper/widget/Flow;Landroidx/constraintlayout/helper/widget/Flow;Landroidx/constraintlayout/helper/widget/Flow;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/FrameLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/view/View;Lorg/xplatform/uikit/components/buttons/DsButton;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/jg;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/jg;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 8
    .line 9
    iput-object p2, p0, La/jg;->b:Landroid/widget/TextView;

    .line 10
    .line 11
    iput-object p3, p0, La/jg;->e:Landroid/view/View;

    .line 12
    .line 13
    iput-object p4, p0, La/jg;->f:Landroid/view/View;

    .line 14
    .line 15
    iput-object p5, p0, La/jg;->g:Landroid/view/View;

    .line 16
    .line 17
    iput-object p6, p0, La/jg;->c:Landroid/widget/TextView;

    .line 18
    .line 19
    iput-object p7, p0, La/jg;->h:Landroid/view/View;

    .line 20
    .line 21
    iput-object p8, p0, La/jg;->k:Landroid/view/View;

    .line 22
    .line 23
    iput-object p9, p0, La/jg;->i:Landroid/view/View;

    .line 24
    .line 25
    iput-object p10, p0, La/jg;->j:Landroid/view/View;

    .line 26
    .line 27
    iput-object p11, p0, La/jg;->l:Landroid/view/View;

    .line 28
    .line 29
    iput-object p12, p0, La/jg;->m:Landroid/view/View;

    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/TextView;Lorg/xplatform/uikit_sport/score/SportScore;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/jg;->a:B

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, La/jg;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 34
    iput-object p2, p0, La/jg;->e:Landroid/view/View;

    .line 35
    iput-object p3, p0, La/jg;->b:Landroid/widget/TextView;

    .line 36
    iput-object p4, p0, La/jg;->f:Landroid/view/View;

    .line 37
    iput-object p5, p0, La/jg;->g:Landroid/view/View;

    .line 38
    iput-object p6, p0, La/jg;->c:Landroid/widget/TextView;

    .line 39
    iput-object p7, p0, La/jg;->h:Landroid/view/View;

    .line 40
    iput-object p8, p0, La/jg;->i:Landroid/view/View;

    .line 41
    iput-object p9, p0, La/jg;->j:Landroid/view/View;

    .line 42
    iput-object p10, p0, La/jg;->k:Landroid/view/View;

    .line 43
    iput-object p11, p0, La/jg;->l:Landroid/view/View;

    .line 44
    iput-object p12, p0, La/jg;->m:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-byte v0, p0, La/jg;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/jg;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    check-cast p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 12
    .line 13
    return-object p0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
