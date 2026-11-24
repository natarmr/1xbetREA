.class public final La/dtx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/yfu0;


# instance fields
.field public final synthetic a:B

.field public final b:Landroid/widget/TextView;

.field public final c:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;Landroid/widget/TextView;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/dtx;->a:B

    iput-object p1, p0, La/dtx;->b:Landroid/widget/TextView;

    iput-object p2, p0, La/dtx;->c:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-byte v0, p0, La/dtx;->a:B

    iget-object p0, p0, La/dtx;->b:Landroid/widget/TextView;

    return-object p0
.end method
