.class public final La/wkd;
.super La/s88;
.source "SourceFile"


# instance fields
.field public final e:Z


# direct methods
.method public constructor <init>(La/y78;Z)V
    .locals 2

    .line 1
    const/4 v0, 0x5

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, p1, v0, v1}, La/s88;-><init>(Ljava/lang/Object;BZ)V

    .line 4
    .line 5
    .line 6
    iput-boolean p2, p0, La/wkd;->e:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final t(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, La/wkd;->e:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-super {p0, p1}, La/s88;->t(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object p0, p0, La/s88;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, La/y78;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/y78;->x(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
