.class public La/dzj0;
.super La/nw70;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/dzj0;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(La/htw;Ljava/lang/String;La/j;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/dzj0;->a:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p1, p0}, La/htw;->g0(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public c(La/htw;Ljava/lang/String;La/j;)V
    .locals 1

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p2, 0x0

    .line 5
    new-array v0, p2, [Ljava/lang/CharSequence;

    .line 6
    .line 7
    iget-object p0, p0, La/dzj0;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p1, p3, p0, v0, p2}, La/htw;->h0(La/j;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
