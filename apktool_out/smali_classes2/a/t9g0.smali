.class public final La/t9g0;
.super La/eby;
.source "SourceFile"


# instance fields
.field public final e:La/n5a;


# direct methods
.method public constructor <init>(La/n5a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/hu00;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/t9g0;->e:La/n5a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final l()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final m(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 2
    .line 3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 4
    .line 5
    iget-object p0, p0, La/t9g0;->e:La/n5a;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
