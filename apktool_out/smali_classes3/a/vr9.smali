.class public final La/vr9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/yfu0;


# instance fields
.field public final synthetic a:B

.field public final b:Landroid/widget/LinearLayout;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/LinearLayout;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vr9;->a:B

    iput-object p1, p0, La/vr9;->b:Landroid/widget/LinearLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-byte v0, p0, La/vr9;->a:B

    iget-object p0, p0, La/vr9;->b:Landroid/widget/LinearLayout;

    return-object p0
.end method
