.class public abstract La/fzw0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zyw0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, La/zyw0;->b()La/hcp0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x40

    .line 6
    .line 7
    invoke-virtual {v0, v1}, La/hcp0;->y(I)V

    .line 8
    .line 9
    .line 10
    sget-object v1, La/drq;->h:La/drq;

    .line 11
    .line 12
    iput-object v1, v0, La/hcp0;->c:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {v0}, La/hcp0;->x()La/zyw0;

    .line 15
    .line 16
    .line 17
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    sput-object v0, La/fzw0;->a:La/zyw0;

    .line 19
    .line 20
    return-void

    .line 21
    :catch_0
    move-exception v0

    .line 22
    invoke-static {v0}, La/itt0;->s(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
