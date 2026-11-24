.class public final synthetic La/x6e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/MenuItem$OnMenuItemClickListener;


# instance fields
.field public final synthetic a:La/e7e;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(La/e7e;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/x6e;->a:La/e7e;

    iput-boolean p2, p0, La/x6e;->b:Z

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 3

    .line 1
    sget-object v0, La/e7e;->d2:La/kwd;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, La/x6e;->a:La/e7e;

    .line 7
    .line 8
    invoke-virtual {p1}, La/e7e;->J0()La/fae;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-boolean p0, p0, La/x6e;->b:Z

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    xor-int/2addr p0, v0

    .line 16
    iget-object p1, p1, La/fae;->q:La/owp0;

    .line 17
    .line 18
    iget-object p1, p1, La/owp0;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, La/g45;

    .line 21
    .line 22
    iget-object p1, p1, La/g45;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, La/i7e;

    .line 25
    .line 26
    iget-object v1, p1, La/i7e;->b:La/q7d0;

    .line 27
    .line 28
    const-string v2, "PREF_KEY_MUTE_STATE"

    .line 29
    .line 30
    invoke-virtual {v1, v2, p0}, La/q7d0;->d(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p1, La/i7e;->h:La/p7m0;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-static {p0, p1, v1}, La/twn;->A(ZLa/p7m0;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return v0
.end method
