.class public final synthetic La/ptj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/w7;


# instance fields
.field public final synthetic a:Lcom/google/android/material/sidesheet/SideSheetBehavior;

.field public final synthetic b:B


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/sidesheet/SideSheetBehavior;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ptj0;->a:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iput-byte p2, p0, La/ptj0;->b:B

    return-void
.end method


# virtual methods
.method public final e(Landroid/view/View;)Z
    .locals 0

    .line 1
    iget-object p1, p0, La/ptj0;->a:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 2
    .line 3
    iget-byte p0, p0, La/ptj0;->b:B

    .line 4
    .line 5
    invoke-virtual {p1, p0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->x(I)V

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0
.end method
