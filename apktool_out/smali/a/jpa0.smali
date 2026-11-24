.class public final La/jpa0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/km40;


# instance fields
.field public b:Lkotlin/jvm/functions/Function1;

.field public c:La/caz;

.field public d:Z

.field public final e:La/n660;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/n660;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p0, v0, La/n660;->d:Ljava/lang/Object;

    .line 10
    .line 11
    sget-object v1, La/ipa0;->a:La/ipa0;

    .line 12
    .line 13
    iput-object v1, v0, La/n660;->b:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object v0, p0, La/jpa0;->e:La/n660;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final f()Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    iget-object p0, p0, La/jpa0;->b:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "onTouchEvent"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method
