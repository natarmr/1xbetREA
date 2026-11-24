.class public final La/qn5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/yfu0;


# instance fields
.field public final synthetic a:B

.field public final b:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/TextView;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/qn5;->a:B

    iput-object p1, p0, La/qn5;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, La/qn5;->c:Landroid/widget/TextView;

    iput-object p3, p0, La/qn5;->d:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-byte v0, p0, La/qn5;->a:B

    iget-object p0, p0, La/qn5;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object p0
.end method
