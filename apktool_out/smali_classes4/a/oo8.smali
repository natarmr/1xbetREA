.class public final La/oo8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/w7;


# instance fields
.field public final a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILa/rbu0;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-byte p1, p0, La/oo8;->a:B

    .line 17
    filled-new-array {p2}, [La/rbu0;

    move-result-object p1

    iput-object p1, p0, La/oo8;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 18
    iput-byte p1, p0, La/oo8;->a:B

    iput-object p2, p0, La/oo8;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/rbu0;La/rbu0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x3e

    .line 5
    .line 6
    iput-byte v0, p0, La/oo8;->a:B

    .line 7
    .line 8
    filled-new-array {p1, p2}, [La/rbu0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, La/oo8;->b:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;I)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/oo8;->b:Ljava/lang/Object;

    iput-byte p2, p0, La/oo8;->a:B

    return-void
.end method


# virtual methods
.method public e(Landroid/view/View;)Z
    .locals 0

    .line 1
    iget-object p1, p0, La/oo8;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 4
    .line 5
    iget-byte p0, p0, La/oo8;->a:B

    .line 6
    .line 7
    invoke-virtual {p1, p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0
.end method
