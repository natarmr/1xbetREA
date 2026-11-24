.class public final La/qk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/yfu0;


# instance fields
.field public final synthetic a:B

.field public final b:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final c:Lorg/xplatform/uikit/components/buttons/DsButton;

.field public final d:Landroid/widget/ImageView;

.field public final e:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/uikit/components/buttons/DsButton;Landroid/widget/ImageView;Landroid/widget/TextView;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/qk;->a:B

    iput-object p1, p0, La/qk;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, La/qk;->c:Lorg/xplatform/uikit/components/buttons/DsButton;

    iput-object p3, p0, La/qk;->d:Landroid/widget/ImageView;

    iput-object p4, p0, La/qk;->e:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-byte v0, p0, La/qk;->a:B

    iget-object p0, p0, La/qk;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object p0
.end method
