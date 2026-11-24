.class public final La/krc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/a1d;


# direct methods
.method public synthetic constructor <init>(La/a1d;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/krc;->a:La/a1d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, La/krc;->a:La/a1d;

    .line 2
    .line 3
    iget-object p0, p0, La/a1d;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/xwb0;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/xwb0;->c:La/n0o0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Landroid/content/SharedPreferences;

    .line 17
    .line 18
    const-string v0, "fingerprint_pass"

    .line 19
    .line 20
    const-string v1, ""

    .line 21
    .line 22
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-nez p0, :cond_0

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_0
    return-object p0
.end method

.method public b()V
    .locals 4

    .line 1
    iget-object p0, p0, La/krc;->a:La/a1d;

    .line 2
    .line 3
    iget-object p0, p0, La/a1d;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/xwb0;

    .line 6
    .line 7
    const-string v0, "fingerprint_auth_enabled"

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, v0, v1}, La/xwb0;->a(Ljava/lang/String;Z)V

    .line 11
    .line 12
    .line 13
    const-string v0, "fingerprint_enabled"

    .line 14
    .line 15
    invoke-virtual {p0, v0, v1}, La/xwb0;->a(Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, La/xwb0;->c:La/n0o0;

    .line 19
    .line 20
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Landroid/content/SharedPreferences;

    .line 25
    .line 26
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v2, "fingerprint_pass"

    .line 31
    .line 32
    const-string v3, ""

    .line 33
    .line 34
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 39
    .line 40
    .line 41
    const-string v0, "biometrics_passed"

    .line 42
    .line 43
    invoke-virtual {p0, v0, v1}, La/xwb0;->a(Ljava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    return-void
.end method
