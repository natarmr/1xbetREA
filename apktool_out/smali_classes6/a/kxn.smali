.class public final synthetic La/kxn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Z

.field public final synthetic c:La/wz40;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(ZZLa/wz40;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/kxn;->a:Z

    iput-boolean p2, p0, La/kxn;->b:Z

    iput-object p3, p0, La/kxn;->c:La/wz40;

    iput-wide p4, p0, La/kxn;->d:J

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-boolean v0, p0, La/kxn;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, La/kxn;->b:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, La/kxn;->d:J

    .line 10
    .line 11
    invoke-static {v0, v1}, La/m5k0;->a(J)La/t33;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object p0, p0, La/kxn;->c:La/wz40;

    .line 16
    .line 17
    iput-object v0, p0, La/wz40;->a:Ljava/lang/Object;

    .line 18
    .line 19
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0
.end method
