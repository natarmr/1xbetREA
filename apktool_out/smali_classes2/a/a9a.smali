.class public final La/a9a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/b7r;


# instance fields
.field public final a:La/pz2;


# direct methods
.method public constructor <init>(La/pz2;La/g9a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/a9a;->a:La/pz2;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p0, p1, La/pz2;->a:Landroid/hardware/camera2/CaptureResult;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/hardware/camera2/CaptureResult;->getFrameNumber()J

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final H(La/sgy;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method public final getMetadata()La/pz2;
    .locals 0

    .line 1
    iget-object p0, p0, La/a9a;->a:La/pz2;

    .line 2
    .line 3
    return-object p0
.end method
