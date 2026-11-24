.class public final La/s9w0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[Lcom/google/android/gms/common/Feature;

.field public final b:Z

.field public final c:C

.field public final synthetic d:La/euo0;


# direct methods
.method public constructor <init>(La/euo0;[Lcom/google/android/gms/common/Feature;ZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/s9w0;->d:La/euo0;

    .line 5
    .line 6
    iput-object p2, p0, La/s9w0;->a:[Lcom/google/android/gms/common/Feature;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    :cond_0
    iput-boolean p1, p0, La/s9w0;->b:Z

    .line 15
    .line 16
    iput-char p4, p0, La/s9w0;->c:C

    .line 17
    .line 18
    return-void
.end method

.method public static a()La/euo0;
    .locals 2

    .line 1
    new-instance v0, La/euo0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-boolean v1, v0, La/euo0;->b:Z

    .line 8
    .line 9
    iput-boolean v1, v0, La/euo0;->c:Z

    .line 10
    .line 11
    iput-char v1, v0, La/euo0;->e:C

    .line 12
    .line 13
    return-object v0
.end method
